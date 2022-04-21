package com.example.msacommunity.service;

import reactor.core.publisher.Mono;

public interface CommentService {

    // 댓글 작성
    Mono<String> insertComment(String commentId);

    // 댓글 숨김처리 (운영자만)
    Mono<String> updateCommentStatus(String commentId);

}
