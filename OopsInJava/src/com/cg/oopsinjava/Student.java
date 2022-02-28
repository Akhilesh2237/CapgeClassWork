package com.cg.oopsinjava;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Student {
	//Variables
int studentId;
String studentName;
Date studentDob;
Scanner sc=new Scanner(System.in);
//methods to acess those varibales
void readStudentDetails() throws ParseException {
	System.out.println("Enter the sudent data");
	System.out.println("Enter the Student Id");
	studentId=sc.nextInt();
	System.out.println("Enter the Student name");
	sc.nextLine();
	studentName=sc.nextLine();
	System.out.println("Enter the Student Date of Birth");
	String dob = sc.nextLine();
	SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
	studentDob = sdf.parse(dob);
}
void displayStudentDetails() {
	System.out.println("Enter the sudent data.....");
	System.out.println(" Student Id" + studentId);
	System.out.println("Student name"+ studentName);
	System.out.println("Student Date of Birth"+studentDob);
}
	
}
