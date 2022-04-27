package com.example.msacommunity.router;

import com.example.msacommunity.handler.CommunityHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.*;
import static org.springframework.web.reactive.function.server.RequestPredicates.accept;

@Configuration
public class CommunityConfig {

    @Bean
    public RouterFunction<ServerResponse> route(CommunityHandler handler) {
        return RouterFunctions
//                .route(GET("/community/board/list").and(accept(MediaType.APPLICATION_JSON)), handler::getBoardList) // 게시판 목록
//                .andRoute(GET("/community/board/{boardId}").and(accept(MediaType.APPLICATION_JSON)), handler::getBoard) // 게시판 열람
                .route(POST("/community/write").and(accept(MediaType.APPLICATION_JSON)), handler::insertCommunity) // 게시글 작성
//                .andRoute(POST("/community/admin/board/hide").and(accept(MediaType.APPLICATION_JSON)), handler::hideArticle) // 게시글 숨김
                ;
    }

}
