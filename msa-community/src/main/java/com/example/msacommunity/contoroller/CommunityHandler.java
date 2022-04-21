package com.example.msacommunity.contoroller;

import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Component
public class CommunityHandler {

    // 게시판 열람
    public Mono<ServerResponse> getCommunityList(ServerRequest request) {
        return (Mono<ServerResponse>) ServerResponse.ok();
    }

    // 게시판 작성
    public Mono<ServerResponse> insertCommunity(ServerRequest request) {
        return (Mono<ServerResponse>) ServerResponse.ok();
    }

}
