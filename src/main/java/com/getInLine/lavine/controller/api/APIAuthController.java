package com.getInLine.lavine.controller.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api")
@RestController // RestController는 Controller에 ResponseBody가 추가된 형태
public class APIAuthController {

    @GetMapping("/sign-up")
    public String signUp() {
        // 이 내용의 뷰를 찾는 것이 아닌, 해당 값을 그대로 내보내줌
        return "done.";
    }
    @GetMapping("/login")
    public String login() {
        return "done.";
    }

}
