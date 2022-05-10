package com.springboot10.springboot10;

import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class AppControler {

    @GetMapping("/")
    public String sayHello(){

        return "Hello this my spring boot app ,10/05/22";
    }
    
}
