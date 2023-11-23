package com.fonyou.task.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ExceptionResponse {
	private final String message;
	private final boolean success  = false;

}