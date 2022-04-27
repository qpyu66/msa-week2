package com.example.msacommunity.service;

import com.example.msacommunity.domain.Community;
import com.example.msacommunity.repository.CommunityRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class CommunityServiceImpl implements CommunityService {

    private final CommunityRepository communityRepository;

    public CommunityServiceImpl(CommunityRepository communityRepository) {
        this.communityRepository = communityRepository;
    }

//    @Override
//    public Mono<Community> getCommunityList(Community community) {
//        return this.communityRepository.save(community);
//    }

    @Override
    public Mono<Community> insertCommunity(Community community) {
        return this.communityRepository.save(community);
    }


}
