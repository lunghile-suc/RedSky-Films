package com.redskyfilms.exceptions;

import java.time.ZonedDateTime;

import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ErrorResponse {

    private final String message;
    private final HttpStatus httpStatus;
    private final int status_code;
    private final ZonedDateTime time_stamp;
    
}
