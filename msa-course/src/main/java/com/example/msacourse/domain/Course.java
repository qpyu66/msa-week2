package com.example.msacourse.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class Course {

    private Long id;
    private String title;
    private String content;
    private String filepath;

}
