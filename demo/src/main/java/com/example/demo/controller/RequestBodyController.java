package com.example.demo.controller;


import com.example.demo.UserRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class RequestBodyController {

    @PostMapping("/users")
    @ResponseBody
    public String create(@RequestBody UserRequest request) {
        return "name=" + request.getName() + ", age=" + request.getAge();
    }
}
