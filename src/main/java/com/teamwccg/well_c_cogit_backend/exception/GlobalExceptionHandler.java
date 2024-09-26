package com.teamwccg.well_c_cogit_backend.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.NoHandlerFoundException;

@ControllerAdvice
@RestController
public class GlobalExceptionHandler {

    // 400 Bad Request 처리
    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<String> handleBadRequest(IllegalArgumentException ex) {
        return ResponseEntity
                .status(HttpStatus.BAD_REQUEST)
                .body("400 Bad Request");
    }

    // 401 Unauthorized 처리
    @ExceptionHandler({org.springframework.security.authentication.BadCredentialsException.class,
            org.springframework.security.core.AuthenticationException.class})
    public ResponseEntity<String> handleUnauthorized(Exception ex) {
        return ResponseEntity
                .status(HttpStatus.UNAUTHORIZED)
                .body("401 Unauthorized");
    }

    // 403 Forbidden 처리
    @ExceptionHandler(org.springframework.security.access.AccessDeniedException.class)
    public ResponseEntity<String> handleForbidden(Exception ex) {
        return ResponseEntity
                .status(HttpStatus.FORBIDDEN)
                .body("403 Forbidden");
    }

    // 404 Not Found 처리
    @ExceptionHandler(NoHandlerFoundException.class)
    public ResponseEntity<String> handleNotFound(NoHandlerFoundException ex) {
        return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .body("404 Not Found");
    }

    // 500 Internal Server Error 처리
    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleInternalServerError(Exception ex) {
        return ResponseEntity
                .status(HttpStatus.INTERNAL_SERVER_ERROR)
                .body("500 Internal Server Error");
    }
}
