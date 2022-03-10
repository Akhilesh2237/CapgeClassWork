package com.cg.java8features.methordreferanceexample.constuctor;

public class ConstuctorReferanceExample {

	public static void main(String[] args) {
		
		DataBase db = DBConnection::new;
		System.out.println(db);
		db.getDBDetails("Connection to DB");

	}

}
