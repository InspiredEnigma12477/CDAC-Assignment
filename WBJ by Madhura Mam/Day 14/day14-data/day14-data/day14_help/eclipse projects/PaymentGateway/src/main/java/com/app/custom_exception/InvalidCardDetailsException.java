package com.app.custom_exception;

public class InvalidCardDetailsException extends RuntimeException {
	public InvalidCardDetailsException(String mesg) {
		super(mesg);
	}
}
