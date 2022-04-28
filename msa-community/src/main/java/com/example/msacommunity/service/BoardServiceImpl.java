package com.example.msacommunity.service;

import com.example.msacommunity.domain.Board;
import com.example.msacommunity.repository.BoardRepository;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.util.stream.Collectors;

@Service
public class BoardServiceImpl implements BoardService {

    private final BoardRepository boardRepository;

    public BoardServiceImpl(BoardRepository boardRepository) {
        this.boardRepository = boardRepository;
    }

//    @Override
//    public Mono<Board> getBoardList(Board board) {
//        return this.communityRepository.save(board);
//    }


    @Override
    public Mono<Board> getBoardOne(String boardid) {
        return this.boardRepository.findById(boardid);
    }

    @Override
    public Mono<Board> insertCommunity(Board board) {
        return this.boardRepository.save(board);
    }



}
