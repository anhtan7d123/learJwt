package com.example.jwt.api;

import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {
    @PostMapping
    public ResponseEntity<?> Test(){
        return ResponseEntity.ok().body(SecurityContextHolder.getContext().getAuthentication().getAuthorities());
    }
}
