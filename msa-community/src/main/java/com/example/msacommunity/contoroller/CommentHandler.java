package com.example.msacommunity.contoroller;

import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Component
public class CommentHandler {

    //insertComment
    public Mono<ServerResponse> insertComment(ServerRequest request) {
        return (Mono<ServerResponse>) ServerResponse.ok();
    }
}
