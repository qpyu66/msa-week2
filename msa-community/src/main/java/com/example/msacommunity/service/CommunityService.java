package com.example.msacommunity.service;

import com.example.msacommunity.domain.Community;
import reactor.core.publisher.Mono;

public interface CommunityService {

    // 게시판 작성
    Mono<Community> insertCommunity(Community community);

}
