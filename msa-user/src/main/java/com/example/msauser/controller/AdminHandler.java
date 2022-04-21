package com.example.msauser.controller;

import com.example.msauser.service.AdminService;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Component
public class AdminHandler {
    private AdminService adminService;

    // 강사 생성
    public Mono<ServerResponse> createTeacher(ServerRequest request){
        return request.bodyToMono(String.class)
                .flatMap(item -> ServerResponse
                        .ok()
                        .body(adminService.createTeacher(item), String.class));
    }

    // 강의 생성
    public Mono<ServerResponse> createCourse(ServerRequest request){
        return request.bodyToMono(String.class)
                .flatMap(item -> ServerResponse
                        .ok()
                        .body(adminService.createCourse(item), String.class));
    }



}
