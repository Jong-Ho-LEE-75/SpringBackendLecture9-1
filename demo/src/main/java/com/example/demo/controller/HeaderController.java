package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HeaderController {

    @GetMapping("/headers")
    @ResponseBody
    public String header(
            @RequestHeader("User-Agent") String userAgent
    ) {
        return "User-Agent=" + userAgent;
    }

    @GetMapping("/cookies")
    @ResponseBody
    public String cookie(
            @CookieValue(value = "SESSION", required = false) String session
    ) {
        return "SESSION=" + session;
    }
}