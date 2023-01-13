package com.challenge.crud.exceptions.handler;

import com.challenge.crud.exceptions.ExceptionBadRequest;
import com.challenge.crud.exceptions.ExceptionResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class ExceptionHandlerController extends ResponseEntityExceptionHandler {

      @ExceptionHandler(ExceptionBadRequest.class)
    public ResponseEntity<ExceptionResponse> handleBadRequest(Exception exception){
          ExceptionResponse exceptionResponse = new ExceptionResponse(exception.getMessage());
          System.out.println(exceptionResponse.getMessage());
          return ResponseEntity.status(400).body(exceptionResponse);
      }

}
