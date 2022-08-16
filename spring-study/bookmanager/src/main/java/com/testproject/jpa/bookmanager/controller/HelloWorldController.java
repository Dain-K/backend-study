package com.testproject.jpa.bookmanager.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController // restapi 의 요청을 받을 수 있다
public class HelloWorldController {
    @GetMapping("/hello-world") // url path
    public String helloWorld() { // helloWorld 를 요청 받으면 문자열 리턴
        return "hello-world";
    }
}