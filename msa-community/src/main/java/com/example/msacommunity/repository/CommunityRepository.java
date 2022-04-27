package com.example.msacommunity.repository;

import com.example.msacommunity.domain.Community;
import org.springframework.data.repository.reactive.ReactiveSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommunityRepository extends ReactiveSortingRepository<Community,Long> {
}
