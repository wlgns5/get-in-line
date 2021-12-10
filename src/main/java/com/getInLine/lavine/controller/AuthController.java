package com.getInLine.lavine.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AuthController {
    @GetMapping("auth/login")
    public String login() {
        return "login";
    }

    @GetMapping("auth/sign-up")
    public String signUp() {
        return "sign-up";
    }
}
