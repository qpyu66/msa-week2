package com.example.msacommunity.service;

import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class ReplyServiceImpl implements ReplyService {
    @Override
    public Mono<String> insertComment(String commentId) {
        return null;
    }

    @Override
    public Mono<String> updateCommentStatus(String commentId) {
        return null;
    }
}
