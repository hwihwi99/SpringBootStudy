package com.example.springbootproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    // RequestMapping에서 메소드를 지정해주지 않으면 모든 HTTPMethod에서 해당 요청이 실행됩니다.
    //@RequestMapping(value = "/hello", method = RequestMethod.GET)
    @GetMapping("hello")
    public String helloWorld() {
        return "hello";
    }
}
