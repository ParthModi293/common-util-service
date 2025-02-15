package org.common.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ValidationException.class)
    public ResponseEntity<Object> handleValidationException(ValidationException ex) {
        return new ResponseEntity<>(Map.of(
                "rCode", ex.getRCode(),
                "rStatus", ex.getRStatus(),
                "displayMessage", ex.getDisplayMessage(),
                "rMsg", ex.getRMsg()
        ), ex.getRStatus());
    }
}
