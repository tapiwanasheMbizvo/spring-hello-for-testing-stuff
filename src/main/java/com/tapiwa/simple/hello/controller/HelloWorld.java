package com.tapiwa.simple.hello.controller;



import java.time.LocalDateTime;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/hello")
public class HelloWorld {


    @GetMapping

    public ResponseEntity<Greeting> helloWorld(){

        Greeting greeting = new Greeting();
        greeting.setGreeting("Hello Kind Stranger");
        greeting.setLocalDateTime(LocalDateTime.now());
        return  ResponseEntity.ok(greeting);
    }
    
}
