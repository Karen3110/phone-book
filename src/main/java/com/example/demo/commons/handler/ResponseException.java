package com.example.demo.commons.handler;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.http.HttpStatus;

@Data
@EqualsAndHashCode(callSuper = true)
public class ResponseException extends Exception {

    private HttpStatus status;

    public ResponseException(HttpStatus status, String message) {
        super(message);
        this.status = status;
    }

    public ResponseException(HttpStatus status) {
        this.status = status;
    }

}
