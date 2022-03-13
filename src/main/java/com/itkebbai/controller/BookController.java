package com.itkebbai.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/books")
public class BookController {
    @GetMapping
    public String hello(){
        System.out.printf("hello Spring Boot");
        return "hello Spring Boot";
    }
}
