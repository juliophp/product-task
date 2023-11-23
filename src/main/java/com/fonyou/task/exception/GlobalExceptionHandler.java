package com.fonyou.task.exception;

import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import com.fonyou.task.dto.ExceptionResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.http.ResponseEntity;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

import javax.validation.ConstraintViolationException;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(ConstraintViolationException.class)
	public ResponseEntity<ExceptionResponse> handleCustomException(ConstraintViolationException e) {
		return ResponseEntity
		.status(HttpStatus.BAD_REQUEST)
		.body(new ExceptionResponse(e.getMessage()));
	}
	@ExceptionHandler(BadRequestException.class)
	public ResponseEntity<ExceptionResponse> handleCustomException(BadRequestException e) {
		return ResponseEntity
		.status(HttpStatus.BAD_REQUEST)
		.body(new ExceptionResponse(e.getMessage()));
	}

	@ExceptionHandler(CustomException.class)
	public ResponseEntity<ExceptionResponse> handleCustomException(CustomException e) {
		return ResponseEntity
		.status(HttpStatus.NOT_FOUND)
		.body(new ExceptionResponse(e.getMessage()));
	}


	@ExceptionHandler(InvalidFormatException.class)
	public ResponseEntity<ExceptionResponse> handleInvalidFormatException(InvalidFormatException e) {
		return ResponseEntity
		.status(HttpStatus. NOT_ACCEPTABLE)
		.body(new ExceptionResponse(e.getMessage()));
	}

	@ExceptionHandler(MethodArgumentTypeMismatchException.class)
	public ResponseEntity<ExceptionResponse> handleArgumentTypeMismatchException(MethodArgumentTypeMismatchException e) {
		return ResponseEntity
				.status(HttpStatus. NOT_ACCEPTABLE)
				.body(new ExceptionResponse("argument for path is not valid"));
	}
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<ExceptionResponse> handleArgumentNotValidException(MethodArgumentNotValidException e) {
		return ResponseEntity
				.status(HttpStatus. NOT_ACCEPTABLE)
				.body(new ExceptionResponse(e.getMessage()));
	}

	@ExceptionHandler(Exception.class)
	public ResponseEntity<ExceptionResponse> handleException(Exception e) {
		e.printStackTrace();
		return ResponseEntity
				.status(HttpStatus.INTERNAL_SERVER_ERROR)
				.body(new ExceptionResponse("something went wrong, please contact admin"));
	}
}