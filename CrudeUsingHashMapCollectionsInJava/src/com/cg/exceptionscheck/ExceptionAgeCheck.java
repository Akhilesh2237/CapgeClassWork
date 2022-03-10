package com.cg.exceptionscheck;

import java.util.Objects;

public class ExceptionAgeCheck {

	private int Age;

	public ExceptionAgeCheck() {
		super();
	}

	public ExceptionAgeCheck(int age) {
		super();
		Age = age;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

	@Override
	public int hashCode() {
		return Objects.hash(Age);
	}



	@Override
	public String toString() {
		return "ExceptionAgeCheck [Age=" + Age + "]";
	}
	
   
}
