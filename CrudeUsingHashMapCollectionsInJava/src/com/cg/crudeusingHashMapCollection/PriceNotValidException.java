package com.cg.crudeusingHashMapCollection;

public class PriceNotValidException extends Exception {

	String message;

	public PriceNotValidException(String message) {
		super();
		this.message = message;
	}
	
	
}
