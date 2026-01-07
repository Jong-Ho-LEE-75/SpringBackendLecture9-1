package com.example.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
public class PathVariableController {

    @GetMapping("/users2/{id}")
    @ResponseBody
    public String getUser(@PathVariable Long id) {
        return "userId=" + id;
    }
}