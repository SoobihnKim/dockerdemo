package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public ResponseEntity<?> home() {
        return ResponseEntity.ok()
                .body("Server is running....");
    }

    @GetMapping("/docker")
    public ResponseEntity<?> docker() {
        return ResponseEntity.ok()
                .body("Hello docker!");
    }

}
