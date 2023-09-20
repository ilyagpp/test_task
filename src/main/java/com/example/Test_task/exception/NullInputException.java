package com.example.Test_task.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.BAD_REQUEST)
public class NullInputException extends RuntimeException{
    public NullInputException(String message) {
        super(message);
    }
}
