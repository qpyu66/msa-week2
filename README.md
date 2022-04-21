# webflux_week2
## Port
~~~
 user 8081
 course 8082
 community 8083
~~~

##domain
~~~
 class User : 유저(학생)정보를 저장하는 클래스
 class Admin: 운영자 정보를 저장하는 클래스
 class Teacher : 강사 정보를 저장하는 클래스
 class Course: 강의 정보를 저장하는 클래스
 class Exam : 시험 정보를 저장하는 클래스
 class Evaluate : 별점 정보를 저장하는 클래스
 class Community : 커뮤니티 정보를 저장하는 클래스
 class Comment : 댓글 정보를 저장하는 클래스
~~~


##controller 
   - Handler는 기존 MVC에서의 컨트롤러 내부 구조를 담당
   - Router는 기존 MVC에서의 Mapping 부분을 담당
~~~
 UserHandler, UserRouter
 AdminHandler, AdminRouter
 CourseHandler, CourseRouter
 ExamHandler, ExamRouter
 CommunityHandler, CommunityRouter
 CommentHandler, CommentRouter
~~~



##service 
~~~
 CourseService: 강의 조회/등록/수정/삭제 등의 기능 담당
 AdminService: 운영자의 관점으로 강사 할당기능 담당
~~~