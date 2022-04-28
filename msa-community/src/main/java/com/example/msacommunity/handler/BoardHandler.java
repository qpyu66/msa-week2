package com.example.msacommunity.handler;

import com.example.msacommunity.domain.Board;
import com.example.msacommunity.kafka.KafkaConsumerService;
import com.example.msacommunity.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

import static org.springframework.http.MediaType.APPLICATION_JSON;

@Component
@RequiredArgsConstructor
public class BoardHandler {

    private final BoardService boardService;

    private final KafkaConsumerService consumerService;

    /**
     * 게시글 작성
     * @param request 게시글 작성 내용
     * @return 게시글 정보 저장
     */
    public Mono<ServerResponse> insertBoard(ServerRequest request) {
        Mono<Board> communityMono = request.bodyToMono(Board.class)
                .flatMap(board -> boardService.insertCommunity(board))
                .log("CommunityMono is : ");
        consumerService.consume("create board");


        return ServerResponse.ok()
                .contentType(APPLICATION_JSON)
                .body(communityMono, Board.class).log("insertCommunity is : ");
    }
}
