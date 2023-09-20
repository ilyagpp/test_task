package com.example.Test_task.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.REQUEST_HEADER_FIELDS_TOO_LARGE)
public class InputOverSizeException extends RuntimeException{

    public InputOverSizeException(String message) {
        super(message);
    }
}
