package com.example.msacommunity.service;

import com.example.msacommunity.domain.Board;
import com.example.msacommunity.repository.BoardRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class BoardServiceImpl implements BoardService {

    private final BoardRepository boardRepository;

    public BoardServiceImpl(BoardRepository boardRepository) {
        this.boardRepository = boardRepository;
    }

//    @Override
//    public Mono<Community> getCommunityList(Community community) {
//        return this.communityRepository.save(community);
//    }

    @Override
    public Mono<Board> insertCommunity(Board board) {
        return this.boardRepository.save(board);
    }


}
