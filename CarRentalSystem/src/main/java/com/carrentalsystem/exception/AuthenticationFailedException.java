package com.carrentalsystem.exception;

public class AuthenticationFailedException extends  RuntimeException {

	public AuthenticationFailedException(String msg) {
		super(msg);
	}
}
