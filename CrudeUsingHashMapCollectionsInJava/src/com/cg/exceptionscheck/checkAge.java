package com.cg.exceptionscheck;

import java.util.Scanner;


public class checkAge extends ExceptionAgeCheck{
Scanner sc = new Scanner(System.in);
	public void checkage() {
		try {
		System.out.println("Enter the age details ");
		System.out.println("Enter the age ");
		setAge(sc.nextInt());
		if(validate(getAge()))
				{
			System.out.println("Enter Age is coorect ");
		}else
		{
			System.out.println("Enter age is in correct ");
		}
	}catch (Exception e) {
		e.fillInStackTrace();
	}
		}
	public boolean validate(int age) throws AgeNotValidException {
		if(age<18)
		{
			throw new AgeNotValidException("Age can not be less than 18 year");
		}
		return true;
	}
}
