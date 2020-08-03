package com.capg.dmeo.springjpa.controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

import com.capg.dmeo.springjpa.errors.InvalidDOBException;
import com.capg.dmeo.springjpa.errors.TraineeAlreadyExistsException;
import com.capg.dmeo.springjpa.model.ErrorResponse;

@RestControllerAdvice
public class ErrorController {

	@ResponseStatus(code = HttpStatus.BAD_REQUEST)
	@ExceptionHandler(value = {TraineeAlreadyExistsException.class,InvalidDOBException.class})
	public ErrorResponse handleTraineeAlreadyExistsException(Exception ex,HttpServletRequest req) {
		return new ErrorResponse(new Date(), ex.getMessage(), HttpStatus.BAD_REQUEST.getReasonPhrase(), HttpStatus.BAD_REQUEST.value(), req.getRequestURI());
	}
	
	
	//
	//
	//
	//
	//
	
	@ExceptionHandler(value = {Exception.class})
	@ResponseStatus(code = HttpStatus.INTERNAL_SERVER_ERROR)
	public ErrorResponse handleOtherException(Exception ex,HttpServletRequest req) {
		return new ErrorResponse(new Date(), ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR.getReasonPhrase(), HttpStatus.INTERNAL_SERVER_ERROR.value(), req.getRequestURI());
	}
	
	
}
