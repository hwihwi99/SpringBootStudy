package com.example.springbootproject.controller;

import com.example.springbootproject.dto.MemberDTO;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/get-api")
public class GetController {

    @GetMapping("hello")
    public String getHello() {
        return "hello world!";
    }

    @GetMapping("/name")
    public String getName() {
        return "I'm HwiLyric";
    }

    @GetMapping("/variable0/{variable0}")
    public String getVariable0(@PathVariable String variable0) {
        return variable0;
    }

    @GetMapping("/variable1/{variable1}")
    public String getVariable1(@PathVariable("variable1") String var1) {
        return var1;
    }

    @GetMapping("/request1")
    public String getQueryString1(
            @RequestParam String name,
            @RequestParam String email,
            @RequestParam String organization) {
        return name+" "+email+" "+organization;
    }

    @GetMapping("/request2")
    public String getQueryString2(@RequestParam Map<String,String> param) {
        StringBuilder stringBuilder = new StringBuilder();

        param.entrySet().forEach(map -> {
            stringBuilder.append(map.getKey() + " : "+map.getValue()+"\n");
        });

        return stringBuilder.toString();
    }

    @GetMapping("/request3")
    public String getQueryString3(MemberDTO memberDTO) {
        return memberDTO.toString();
    }

}
