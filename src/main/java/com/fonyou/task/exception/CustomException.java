package com.fonyou.task.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class CustomException extends RuntimeException {
	private final String message;

	public static CustomException as(String message) {
		return new CustomException(message);
	}

}