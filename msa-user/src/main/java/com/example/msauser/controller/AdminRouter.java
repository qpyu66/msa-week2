package com.example.msauser.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.POST;
import static org.springframework.web.reactive.function.server.RequestPredicates.path;
import static org.springframework.web.reactive.function.server.RouterFunctions.nest;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Configuration
public class AdminRouter {

    @Bean
    public RouterFunction<ServerResponse> routeByAdmin(AdminHandler adminHandler) {
        return nest(path("/admin"),
                route(POST("/create/teacher"), adminHandler::createTeacher)
                        .andRoute(POST("/create/course"), adminHandler::createCourse));
    }

}
