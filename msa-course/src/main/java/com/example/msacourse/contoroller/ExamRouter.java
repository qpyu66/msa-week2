package com.example.msacourse.contoroller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.*;

import static org.springframework.web.reactive.function.server.RouterFunctions.nest;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Configuration
public class ExamRouter {

    @Bean
    public RouterFunction<ServerResponse> routeByExam(ExamHandler handler){
        return nest(path("exam"),
                route(GET("/course/{courseid}/exam/{examid}"), handler::getExamContent));
    }
}
