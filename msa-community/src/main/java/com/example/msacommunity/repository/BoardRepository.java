package com.example.msacommunity.repository;

import com.example.msacommunity.domain.Board;
import org.springframework.data.repository.reactive.ReactiveSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BoardRepository extends ReactiveSortingRepository<Board,Long> {
}
