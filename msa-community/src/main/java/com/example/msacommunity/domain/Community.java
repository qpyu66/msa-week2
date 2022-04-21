package com.example.msacommunity.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class Community {

    private Long id;
    private String title;
    private String content;
}
