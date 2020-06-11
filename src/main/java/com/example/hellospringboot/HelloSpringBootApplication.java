package com.example.hellospringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Administrator
 */
@RestController
@SpringBootApplication
public class HelloSpringBootApplication {

    @GetMapping("/hello")
    public String hello(){
        return "hello world";
    }
    public static void main(String[] args) {

        SpringApplication.run(HelloSpringBootApplication.class, args);
    }

}
