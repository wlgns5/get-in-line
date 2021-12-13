package com.getInLine.lavine.controller.api.error;

import com.getInLine.lavine.constant.ErrorCode;
import com.getInLine.lavine.dto.APIErrorResponse;
import com.getInLine.lavine.exception.GeneralException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class BaseExceptionHandler {

    @ExceptionHandler
    public ModelAndView general(GeneralException e) {
        ErrorCode errorCode = e.getErrorCode();
        HttpStatus status = errorCode.isClientSideError() ? HttpStatus.BAD_REQUEST : HttpStatus.INTERNAL_SERVER_ERROR;

        Map<String, Object> map = new HashMap<>();
        map.put("statusCode", status.value());
        map.put("errorCode", errorCode);
        map.put("message", errorCode.getMessage(status.getReasonPhrase()));


        return new ModelAndView("error", map ,status);
    }

    @ExceptionHandler
    public ModelAndView exception(Exception e) {
        ErrorCode errorCode = ErrorCode.INTERNAL_ERROR;
        HttpStatus status = HttpStatus.INTERNAL_SERVER_ERROR;

        Map<String, Object> map = new HashMap<>();
        map.put("statusCode", status.value());
        map.put("errorCode", errorCode);
        map.put("message", errorCode.getMessage(status.getReasonPhrase()));


        return new ModelAndView("error", map ,status);
    }
}
