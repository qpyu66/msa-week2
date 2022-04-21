package com.example.msauser.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;


@Configuration
@RequiredArgsConstructor
public class UserHandler {

    public Mono<ServerResponse> getList(ServerRequest request) {
        return (Mono<ServerResponse>) ServerResponse.ok();
    }



}
