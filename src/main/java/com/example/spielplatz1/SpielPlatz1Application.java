package com.example.spielplatz1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller
public class SpielPlatz1Application {

    public static void main(String[] args) {
        SpringApplication.run(SpielPlatz1Application.class, args);
    }

    @GetMapping ("/")
    public String getHello() {
    	return "Hello"; // returns the html file
    }
}
