package com.school.management.exception;

import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class PeopleControllerAdvice {
	@ExceptionHandler(InvalidPeopleException.class)
    public ResponseEntity<Object> handleCityNotFoundException(
        InvalidPeopleException ex, WebRequest request) {

        Map<String, Object> body = new LinkedHashMap<>();
        body.put("timestamp", LocalDateTime.now());
        body.put("message", "Model not found");

        return new ResponseEntity<>(body, HttpStatus.NOT_FOUND);
    }
}
