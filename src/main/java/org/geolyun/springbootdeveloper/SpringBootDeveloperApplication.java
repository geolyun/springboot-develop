package org.geolyun.springbootdeveloper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // 스프링 부트 사용에 필요한 기본 설정을 해준다.
public class SpringBootDeveloperApplication {
    // - public : JVM이 main함수를 찾을 수 있도록 한다.
    //- static : JVM이 main함수를 곧바로 실행할 수 있도록 한다.
    //- void : main함수가 종료되면 프로그램도 종료되므로, return값이 필요하지 않다.
    //- String[] args : 커맨드라인 등을 통해, main함수 내부에서 사용할 수 있는 String 데이터를 전달할 수 있다.
    public static void main(String[] args) {
        SpringApplication.run(SpringBootDeveloperApplication.class, args);
    }
}
