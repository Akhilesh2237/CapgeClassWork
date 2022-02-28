package com.cg.oopsinjava;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Employee {
	int employeeId;
	String employeeName;
	String employeeEmail;
	String employeeMob;
	Date employeeDob;
	Date employeeDoj;
	
	 void readEmployeeDetails() throws ParseException {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the details of Employee");
	System.out.println("Enter the Employee Id");
	employeeId=sc.nextInt();
	System.out.println("Enter the employee Name");
	employeeName=sc.nextLine();
	sc.nextLine();
	System.out.println("Enter the employee email");
	employeeEmail=sc.nextLine();
	if(validate(employeeEmail)) {
		System.out.println("Thank you for providing correct email.....");
	}else {
		System.out.println("Enter email in specified format (ex:- swapna@gmail.com)");
	}
	System.out.println("Enter Employee Mob No");
	employeeMob=sc.nextLine();
	if(employeeMob.matches("\\d{10}")) {
		System.out.println("Mobile Number is valid");
	}if(checkMobileNumber(employeeMob)) {
		System.out.println("Mobile number is valid");
	}else {
		System.out.println("Entered mobile number is not valid");
		System.out.println("Do you want Enter Mobile number which is  valid (y/n)....");
		char ch = sc.next().charAt(0);
		if(ch== 'y') {
			System.out.println("Enter mobile number in specified format (ex:- 07892333222 / 917892333222)");
			sc.nextLine();
			employeeMob =  sc.nextLine();
		}else {
			System.out.println("Thank you for providing your details.....");
		}
	}
	System.out.println("Enter the employee Dob");
	String dob = sc.nextLine();
	SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
	employeeDob = sdf.parse(dob);
	System.out.println("Enter the employee DOJ");
	String Doj=sc.nextLine();
	SimpleDateFormat abc=new SimpleDateFormat("dd/MM/yyyy");
	employeeDoj = sdf.parse(Doj);
	}
	 boolean checkMobileNumber(String employeeMob2) {
		 Pattern ptrn = Pattern.compile("(0/91)?[7-9][0-9]{9}");
			Matcher match = ptrn.matcher(employeeMob2);
			return (match.find() && match.group().equals(employeeMob2));
	}
	 
	 public static final Pattern VALID_EMAIL_ADDRESS_REGEX = 
			    Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
	 boolean validate(String employeeEmail2) {
		  Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(employeeEmail2);
	        return matcher.find();
	}
	void displayEmployeeDetails(){
		System.out.println("the Employee Id"+employeeId);
		System.out.println("the employee Name" +employeeName);
		System.out.println("the employee email" +employeeEmail);
		System.out.println("Employee Mob No" +employeeMob);
		System.out.println("the employee Dob"+employeeDob);
		System.out.println("the employee DOJ"+employeeDoj);
		
	}
}
