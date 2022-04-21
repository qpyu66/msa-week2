package com.example.msacommunity.contoroller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.*;
import static org.springframework.web.reactive.function.server.RequestPredicates.POST;
import static org.springframework.web.reactive.function.server.RouterFunctions.nest;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Configuration
public class CommunityRouter {

    @Bean
    public RouterFunction<ServerResponse> routeByCommunity(CommunityHandler handler, CommentHandler commentHandler){
        return nest(path("community"),
                route(GET("/community/{id}"), handler::getCommunityList)
                        .andRoute(POST("/insert"), handler::insertCommunity)
                        .andRoute(POST("/comment"), commentHandler::insertComment));
    }

}
