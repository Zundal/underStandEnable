package me.ajeongsik;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
// 하단의 3 어노테이션을 합쳐 놓은 것
//@SpringBootApplication
@SpringBootConfiguration // @Configuration
@ComponentScan  // 1. bean 을 읽어 온다.
@EnableAutoConfiguration // 2. Component Scan이 읽어 온 bean을 등록 한다. bean 을 2번 등록 한다
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
