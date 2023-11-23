package com.fonyou.task.dto;

import lombok.Getter;

@Getter
public class SuccessResponse {
	private final Object message;
	private final boolean success = true;

	public SuccessResponse(Object message) {
		this.message = message;
	}
}