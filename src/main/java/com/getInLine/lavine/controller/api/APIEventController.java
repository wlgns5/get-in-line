package com.getInLine.lavine.controller.api;

import com.getInLine.lavine.constant.ErrorCode;
import com.getInLine.lavine.dto.APIErrorResponse;
import com.getInLine.lavine.exception.GeneralException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RequestMapping("/api")
@RestController
public class APIEventController {
    @GetMapping("/events")
    public List<String> getEvents() {
        throw new GeneralException("테스트 메시지");
//        return Arrays.asList("event1", "event2");
    }

    @PostMapping("/events")
    public Boolean createEvent() {
        throw new GeneralException("runtime 테스트 메시지");
//        return true;
    }

    @GetMapping("/events/{eventId}")
    public String getEvent(@PathVariable Integer eventId) {return "event " + eventId;}

    @PutMapping("/events/{eventId}")
    public Boolean modifyEvent(@PathVariable Integer eventId) {return true;}

    @DeleteMapping("/events/{eventId}")
    public Boolean removeEvent(@PathVariable Integer eventId) {return true;}

    // 해당 method 내에서 GeneralException이 터지는 걸 잡아줌 (stack tree에 포함된경우)
}
