package com.example.example.controllers;

import com.example.example.models.Users;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/test")
public class MainController {


    @RequestMapping(value = "/api")
    //@CrossOrigin(origins = "http://localhost:3000")
    public Users rrt() {
        System.out.println("WAS REQUEST!!!!!!!!!!!!!!");
        return new Users("Alex", "33");
    }

//    @RequestMapping(value = "/test/api")
//    public String rrt() {
//        System.out.println("WAS REQUEST!!!!!!!!!!!!!!");
//        return "{\"firstName\":\"John\", \"lastName\":\"Doe\"}";
//    }

}
