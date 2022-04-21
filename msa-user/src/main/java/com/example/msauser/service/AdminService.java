package com.example.msauser.service;

import reactor.core.publisher.Mono;

public interface AdminService {
    // 강사 생성
    Mono<String> createTeacher(String userId);

    // 강의 생성
    Mono<String> createCourse(String courseId);

    // 강의에 강사 배정
    Mono<String> updateCourseToTeacher(String userId);

    // 강의 접근 권한 변경
    Mono<String> updateCourseAuthority(String courseId);

    // 강의 별점 열람
    Mono<String> readCourseEvaluate(String courseId);

}
