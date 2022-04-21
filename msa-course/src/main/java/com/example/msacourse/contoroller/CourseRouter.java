package com.example.msacourse.contoroller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.*;
import static org.springframework.web.reactive.function.server.RouterFunctions.nest;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Configuration
public class CourseRouter {

    @Bean
    public RouterFunction<ServerResponse> routeByCourse(CourseHandler handler){
        return nest(path("course"),
                //getCourseAllList
                route(GET("/class"), handler::getCourseAllList)
                        .andRoute(GET("/class/{id}"), handler::getCourseId));
    }


}
