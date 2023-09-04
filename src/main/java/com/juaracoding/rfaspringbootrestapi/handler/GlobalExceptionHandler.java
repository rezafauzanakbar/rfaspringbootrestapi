package com.juaracoding.rfaspringbootrestapi.handler;
/*
IntelliJ IDEA 2023.2 (Ultimate Edition)
Build #IU-232.8660.185, built on July 26, 2023
@Author user a.k.a. Reza Fauzan Akbar
Java Developer
Created on 31/08/2023 14:06
@Last Modified 31/08/2023 14:06
Version 1.0
*/

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.Nullable;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.ArrayList;
import java.util.List;

@RestControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {
    private List<ApiValidationError> lsSubError = new ArrayList<ApiValidationError>();

    @Override
    @ResponseStatus(HttpStatus.UNPROCESSABLE_ENTITY)
    //@ResponseStatus(HttpStatus.BAD_REQUEST)
    protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
                                                                  HttpHeaders headers,
                                                                  HttpStatus status,
                                                                  WebRequest request) {
        lsSubError.clear();
        for (FieldError fieldError : ex.getBindingResult().getFieldErrors()) {
            lsSubError.add(new ApiValidationError(fieldError.getField(),fieldError.getDefaultMessage(),fieldError.getRejectedValue(),fieldError.getObjectName()));
        }

        ApiError apiError = new ApiError(HttpStatus.UNPROCESSABLE_ENTITY, "TIDAK DAPAT DIPROSES",ex,request.getDescription(false),"X-0001");
        //new ApiError(HttpStatus.BAD_REQUEST, "TIDAK DAPAT DIPROSES",ex,request.getDescription(false),"X-0001");
        apiError.setSubErrors(lsSubError);
        return ResponseEntity.unprocessableEntity().body(apiError);
        //return new ResponseEntity<Object>(apiError,HttpStatus.BAD_REQUEST);
    }

    private ResponseEntity<Object> buildResponseEntity(ApiError apiError) {
        return ResponseEntity.status(apiError.getStatus()).body(apiError);
    }

    @Override
    protected ResponseEntity<Object> handleExceptionInternal(Exception ex, @Nullable Object body, HttpHeaders headers, HttpStatus status, WebRequest request) {
        return buildResponseEntity(new ApiError(HttpStatus.INTERNAL_SERVER_ERROR,"TIDAK DAPAT DIPROSES",ex,request.getDescription(false),"X2236"));
    }
}
