package com.redskyfilms.exceptions;

public class BookingNotFound extends RuntimeException  {
    public BookingNotFound(String message){
        super(message);
    }

    public BookingNotFound(String message, Throwable cause){
        super(message, cause);
    }
}
