package com.example.msacourse.service;

import com.example.msacourse.domain.Course;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface CourseService {

    // 강의 선택
    Mono<String> getCourseId(String courseId);

    // 강의 목록
    Flux<Course> getCourseAllList(Mono<String> courseId);

    // 강의 별점
    Mono<String> insertCourseEvaluate(String courseId);

    // 강의 확인
    Mono<String> readCourseTakeList(String courseId);



    // 수강 확인
    Mono<String> readCourse(String courseId);

    //수강 열람
    Flux<Course> getCourse(String courseId);

    //수강 신청
    Mono<String> registCource(String courseId);


}
