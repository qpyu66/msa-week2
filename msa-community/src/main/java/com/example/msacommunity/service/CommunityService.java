package com.example.msacommunity.service;

import com.example.msacommunity.domain.Community;
import reactor.core.publisher.Mono;

public interface CommunityService {

    // 게시판 열람
    Mono<String> getCommunityList(String communityId);

    // 게시판 작성
    Mono<String> insertCommunity(String communityId);


}
