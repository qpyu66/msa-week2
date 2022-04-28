package com.example.msacommunity.domain;

import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDateTime;

@Table(value = "board")
@Getter
@Setter
@ToString
@AllArgsConstructor
public class Board {

    @Id
    private Integer id;

    private String title; //게시글 제목

    private String content; //게시글 내용

    private Integer visibleyn; //게시글 노출 여부

    private Integer memberid; //작성자

    @CreatedDate
    private LocalDateTime insertdt; //생성일

    @LastModifiedDate
    private LocalDateTime updatedt; //수정일
}
