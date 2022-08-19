package com.school.management.exception;

public class InvalidPeopleException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public InvalidPeopleException() {
		super();
	}

	public InvalidPeopleException(String message, Throwable cause) {
		super(message, cause);
	}

	public InvalidPeopleException(String message) {
		super(message);
	}

}
