package com.example.springbootproject.controller;

import com.example.springbootproject.dto.MemberDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/put-api")
public class PutController {

    @PutMapping("/default")
    public String putMethod() {
        return "hello, putMapping";
    }

    @PutMapping("/member")
    public String putMember(@RequestBody Map<String,Object> putData) {
        StringBuilder sb = new StringBuilder();
        putData.entrySet().forEach(map -> {
            sb.append(map.getKey() + " : "+map.getValue() +"\n");
        });
        return sb.toString();
    }

    @PutMapping("/member1")
    public String putMemberDto1(@RequestBody MemberDTO memberDTO){
        return memberDTO.toString();
    }

    @PutMapping("/member2")
    public MemberDTO putMemberDto2(@RequestBody MemberDTO memberDTO){
        return memberDTO;
    }

    @PutMapping("/member3")
    public ResponseEntity<MemberDTO> putMemberDto3(@RequestBody MemberDTO memberDTO){
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(memberDTO);
    }
}
