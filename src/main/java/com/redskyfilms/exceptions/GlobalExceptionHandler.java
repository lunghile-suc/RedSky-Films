package com.redskyfilms.exceptions;

import java.time.ZoneId;
import java.time.ZonedDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
    
    @ExceptionHandler(value = MovieNotFound.class)
    public ResponseEntity<Object> movie_not_found_exception(MovieNotFound movieNotFound){
        ErrorResponse errorResponse = new ErrorResponse(
                        movieNotFound.getMessage(), 
                        HttpStatus.NOT_FOUND,
                        HttpStatus.NOT_FOUND.value(), 
                        ZonedDateTime.now(ZoneId.of("Z")));
        
        return new ResponseEntity<Object>(errorResponse, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(value = UserNotFound.class)
    public ResponseEntity<Object> user_not_found_exception(UserNotFound userNotFound){
        ErrorResponse errorResponse = new ErrorResponse(
                        userNotFound.getMessage(), 
                        HttpStatus.NOT_FOUND,
                        HttpStatus.NOT_FOUND.value(), 
                        ZonedDateTime.now(ZoneId.of("Z")));
        
        return new ResponseEntity<Object>(errorResponse, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(value = BookingNotFound.class)
    public ResponseEntity<Object> booking_not_found_exception(BookingNotFound bookingNotFound){
        ErrorResponse errorResponse = new ErrorResponse(
                        bookingNotFound.getMessage(), 
                        HttpStatus.NOT_FOUND,
                        HttpStatus.NOT_FOUND.value(), 
                        ZonedDateTime.now(ZoneId.of("Z")));
        
        return new ResponseEntity<Object>(errorResponse, HttpStatus.NOT_FOUND);
    }
}
