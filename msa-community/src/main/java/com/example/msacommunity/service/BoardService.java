package com.example.msacommunity.service;

import com.example.msacommunity.domain.Board;
import reactor.core.publisher.Mono;

public interface BoardService {

    Mono<Board> getBoardOne(String boardid);

    // 게시판 작성
    Mono<Board> insertCommunity(Board board);


}
