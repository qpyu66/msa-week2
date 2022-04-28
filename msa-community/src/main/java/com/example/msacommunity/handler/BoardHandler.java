package com.example.msacommunity.handler;

import com.example.msacommunity.domain.Board;
import com.example.msacommunity.kafka.KafkaConsumerService;
import com.example.msacommunity.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

import java.util.stream.Collectors;

import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.web.reactive.function.server.ServerResponse.ok;

//@Slf4j
@Component
@RequiredArgsConstructor
public class BoardHandler {

    private final BoardService boardService;
    private final KafkaConsumerService consumerService;

    /**
     * 게시글 목록
     *
     * @param request
     * @return
     */
    public Mono<ServerResponse> getBoardList(ServerRequest request) {
        Mono<Board> boardMono = request.bodyToMono(Board.class)
                .flatMap(board -> boardService.insertCommunity(board))
                .log("CommunityMono is : ");
        consumerService.consume("board list");

        return ok()
                .contentType(APPLICATION_JSON)
                .body(boardMono, Board.class).log("getBoardList is : ");
    }


    public Mono<ServerResponse> getBoardOne(ServerRequest request) {

        String bid = request.pathVariable("boardid");
        consumerService.consume("board get id = "+bid);

        return boardService.getBoardOne(request.pathVariable(bid))
                .flatMap(book -> ServerResponse.ok().contentType(MediaType.APPLICATION_JSON).bodyValue(book))
                .switchIfEmpty(ServerResponse.notFound().build()).log("getBoardOne ");
    }



    /**
     *
     */
//    @PreAuthorize("hasAnyAuthority('ROLE_ADMIN', 'ROLE_USER')")
//    public Mono<ServerResponse> findAll(ServerRequest request) {
//        log.info("]-----] SampleHandler::findAll call [-----[ ");
//        Integer page = request.queryParam("page").isPresent() ? Integer.parseInt(request.queryParam("page").get()) - 1 : 0;
//        Integer size = request.queryParam("pagesize").isPresent() ? Integer.parseInt(request.queryParam("pagesize").get()) : 20;
////        Sort sort = new Sort(Sort.Direction.DESC, "insertdt");
//        return Mono.just(pageRepository.findAll(PageRequest.of(page, size)))
//                .flatMap(sample -> ok().body(fromObject(sample)))
//                .switchIfEmpty(notFound().build());
//    }


    /**
     * 게시글 작성
     *
     * @param request 게시글 작성 내용
     * @return 게시글 정보 저장
     */
    public Mono<ServerResponse> insertBoard(ServerRequest request) {
        Mono<Board> communityMono = request.bodyToMono(Board.class)
                .flatMap(board -> boardService.insertCommunity(board))
                .log("CommunityMono is : ");
        consumerService.consume("create board");

        return ok()
                .contentType(APPLICATION_JSON)
                .body(communityMono, Board.class).log("insertCommunity is : ");
    }
}
