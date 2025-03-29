package com.march.controller.advice;

import java.util.Date;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import com.march.exception.Error;
import com.march.exception.ResourceNotAvailableException;

import jakarta.servlet.http.HttpServletRequest;

@RestControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(value = RuntimeException.class)
	public ResponseEntity<?> handleRunTimeException(RuntimeException ex, HttpServletRequest request){
		Error error = new Error();
		error.setCode(404);
		error.setMessage(ex.getMessage().trim());
		error.setPath(request.getRequestURI());
		error.setTimeStamp(new Date());
		
		return ResponseEntity.status(404).body(error);
	}
	
	@ExceptionHandler(value = MethodArgumentNotValidException.class)
	public ResponseEntity<?> handleRunTimeException(MethodArgumentNotValidException ex, HttpServletRequest request){
		Error error = new Error();
		error.setCode(404);
		error.setMessage(ex.getMessage().trim());
		error.setPath(request.getRequestURI());
		error.setTimeStamp(new Date());
		
		return ResponseEntity.status(404).body(error);
	}
	
	@ExceptionHandler(value = ResourceNotAvailableException.class)
	public ResponseEntity<?> handleResourceNotAvailableException(ResourceNotAvailableException ex, HttpServletRequest request){
		Error error = new Error();
		error.setCode(ex.getCode());
		error.setMessage(ex.getMessage().trim());
		error.setPath(request.getRequestURI());
		error.setTimeStamp(new Date());
		
		return ResponseEntity.status(ex.getCode()).body(error);
	}
}
