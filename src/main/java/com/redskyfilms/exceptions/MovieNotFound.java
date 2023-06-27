package com.redskyfilms.exceptions;

public class MovieNotFound extends RuntimeException{

    public MovieNotFound(String message){
        super(message);
    }

    public MovieNotFound(String message, Throwable cause){
        super(message, cause);
    }
}
