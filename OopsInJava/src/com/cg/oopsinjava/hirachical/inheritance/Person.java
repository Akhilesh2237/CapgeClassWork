package com.cg.oopsinjava.hirachical.inheritance;

import java.util.Scanner;

public class Person {
String personName;
String personAddress;
Scanner sc= new Scanner(System.in);

void readPersonDetails() {
	System.out.println("Enter the Person Details.....");
	System.out.println("Enter the Person Name");
	personName=sc.nextLine();
	System.out.println("Enter the Person Address");
	personAddress=sc.nextLine();
}

void printPersonDetails() {
	System.out.println(" Person Name = "+personName);
	System.out.println("Person Address = "+personAddress);

}
}
