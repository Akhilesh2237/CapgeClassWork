package com.cg.crudeusingHashMapCollection;

public class CharaterNotValidException extends Exception {

	String message;

	public CharaterNotValidException(String message) {
		super(message);
		this.message = message;
	}
	
}
