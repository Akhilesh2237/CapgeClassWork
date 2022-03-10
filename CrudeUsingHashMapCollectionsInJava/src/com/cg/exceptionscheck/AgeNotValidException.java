package com.cg.exceptionscheck;

public class AgeNotValidException extends Exception {

	String message;

	public AgeNotValidException(String message) {
		super();
		this.message = message;
	}
	
}
