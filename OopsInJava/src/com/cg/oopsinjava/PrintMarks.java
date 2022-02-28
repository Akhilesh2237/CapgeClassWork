package com.cg.oopsinjava;

import java.util.Scanner;

public class PrintMarks {
	int rollNumber;
	int math;
	int science;
	int english;
	int avge;
 void readMarks() {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the Student details");
	 System.out.println("Enter the Student Roll Number");
	 rollNumber =sc.nextInt();
	System.out.println("Enter the Mark in Math subject");
	math=sc.nextInt();
	while(math<0||math>100){
	     System.out.println("You Entered the wrong number , Enter The number Again :");
	     math = sc.nextInt();
	}
	System.out.println("Enter the Mark in Science subject");
	science=sc.nextInt();
	while(science<0||science>100){
	     System.out.println("You Entered the wrong number , Enter The number Again :");
	     science = sc.nextInt();
	}
	System.out.println("Enter the Mark in English subject");
	 english=sc.nextInt();
	 while(english<0||english>100){
	     System.out.println("You Entered the wrong number , Enter The number Again :");
	     english = sc.nextInt();
	}
	 avge=(math+science+english)/3;
 }
 void displayMarks() {
	 System.out.println("Student Roll number is = " +rollNumber);
	 System.out.println("Math ="+math);
	 System.out.println("Math ="+science);
	 System.out.println("Math ="+english);
System.out.println("Avergae marks is "+avge);
 }
}
