package com.srikar.springboot.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by vedantas on 2/9/2018.
 */
@RestController
public class HelloService {
    @RequestMapping("/")
    public String hello(){
        return "Hello, World!";
    }
}
