package com.example.msacourse.contoroller;

import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Component
public class ExamHandler {

    // 시험 내용
    public Mono<ServerResponse> getExamContent(ServerRequest request) {
        return (Mono<ServerResponse>) ServerResponse.ok();
    }
}
