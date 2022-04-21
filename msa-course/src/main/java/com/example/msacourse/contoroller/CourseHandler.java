package com.example.msacourse.contoroller;

import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Component
public class CourseHandler {

    //강의 선택
    public Mono<ServerResponse> getCourseId(ServerRequest request) {
        return (Mono<ServerResponse>) ServerResponse.ok();
    }


    //강의 목록
    public Mono<ServerResponse> getCourseAllList(ServerRequest request) {
        return (Mono<ServerResponse>) ServerResponse.ok();
    }



}
