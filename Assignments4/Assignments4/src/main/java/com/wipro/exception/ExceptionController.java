package com.wipro.exception;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionController {
	
	@ExceptionHandler({MyResourceNotFoundException.class})
	public String clientError() {
		return "Invalid Url";
	}
	
	
	@ExceptionHandler(value = Exception.class)
	public String serverSideIssue() {
		return "Got Server Side Issue";
	}
	
	

}
