package com.app.dto;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class ApiResponse {
	private String message;
	private String errorDetails;
	private LocalDateTime timeStamp;
	public ApiResponse(String message, String errorDetails) {
		super();
		this.message = message;
		this.errorDetails = errorDetails;
		timeStamp=LocalDateTime.now();
	}
	
}
