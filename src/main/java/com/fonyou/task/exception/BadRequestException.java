package com.fonyou.task.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.context.support.DefaultMessageSourceResolvable;
import org.springframework.validation.ObjectError;

import java.util.List;
import java.util.stream.Collectors;

@Getter
@AllArgsConstructor
public class BadRequestException extends RuntimeException {
	private final String message;

	public static BadRequestException as(List<ObjectError> errors) {
		return new BadRequestException(errors.stream().map(DefaultMessageSourceResolvable::getDefaultMessage)
				.collect(Collectors.joining(", ")));
	}
}