package com.cg.oopsinjava.hirachical.inheritance;

public class Student extends Person{

	String program;
	int year;
	double fees;
	
	void readStudentDetails() {
		System.out.println("Enter the Student details");
		System.out.println("Enter the Program");
		program=sc.nextLine();
		System.out.println("Enter the year");
		year=sc.nextInt();
		System.out.println("Enter the fees");
		fees=sc.nextDouble();
	}
	
	void printStudentDetails() {
		System.out.println("the Program for which enroll is = "+program);
		System.out.println("the Total year of study is = "+year);
		System.out.println("the Tota fees required is =" +fees);

	}
}
