package com.example.msacourse.service;

import com.example.msacourse.domain.Course;
import com.example.msacourse.domain.Exam;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ExamService {

    // 시험 목록
    Mono<String> getExamContent(String courseId);

}
