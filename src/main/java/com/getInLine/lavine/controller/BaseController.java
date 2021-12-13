package com.getInLine.lavine.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

public class BaseController {
    @GetMapping("/")
    public String root() {
        return "index";
    }
}
