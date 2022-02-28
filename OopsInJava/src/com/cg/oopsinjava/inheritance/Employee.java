package com.cg.oopsinjava.inheritance;

import java.util.Scanner;

public class Employee {
int employeeId;
String employeeName;
String employeeAddress;
String employeeCountry;
Scanner sc=new Scanner(System.in);
void readEmployeeDetails() {
	
	System.out.println("Enter the employee details");
	System.out.println("Enter the employeeId: ");
	employeeId=sc.nextInt();
	System.out.println("Enter the employeeName:");
	employeeName=sc.nextLine();
	System.out.println("Enter the employee Address:");
	employeeAddress=sc.nextLine();
	System.out.println("ENter the employee Countery");
	employeeCountry=sc.nextLine();
}
void printEmployeeDetails() {
	System.out.println(" employee details are..........");
	System.out.println("  employeeId: " +employeeId);
	System.out.println(" employeeName: "+employeeName);
	System.out.println(" employee Address: "+employeeAddress);
	System.out.println(" employee Countery: " +employeeCountry);
}
}
