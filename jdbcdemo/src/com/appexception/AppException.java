package com.appexception;

public class AppException extends Exception{
	private String message;
	public AppException() {
		super();
	}

	@Override
	public String getMessage() {
		
		return this.message;
	}

	public AppException(String message) {
		super();
		this.message = message;
	}

}
