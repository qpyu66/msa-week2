package com.example.msacommunity.handler;

import com.example.msacommunity.domain.Community;
import com.example.msacommunity.service.CommentService;
import com.example.msacommunity.service.CommunityService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

import static org.springframework.http.MediaType.APPLICATION_JSON;

@Component
@RequiredArgsConstructor
public class CommunityHandler {

    private final CommunityService communityService;

    /**
     * 게시글 작성
     * @param request 게시글 작성 내용
     * @return 게시글 정보 저장
     */
    public Mono<ServerResponse> insertCommunity(ServerRequest request) {
        Mono<Community> communityMono = request.bodyToMono(Community.class)
                .flatMap(community -> communityService.insertCommunity(community))
                .log("CommunityMono is : ");

        return ServerResponse.ok()
                .contentType(APPLICATION_JSON)
                .body(communityMono, Community.class).log("insertCommunity is : ");
    }
}
