package com.cg.crudeusingHashMapCollection;

public class ProductNotFoundException extends Exception {

	String message;

	public ProductNotFoundException(String message) {
		super();
		this.message = message;
	}
}
