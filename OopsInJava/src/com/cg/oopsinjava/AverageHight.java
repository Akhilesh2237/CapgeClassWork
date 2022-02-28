package com.cg.oopsinjava;

import java.util.Scanner;

public class AverageHight {
	int n;
	 int noOfStudent[]=new int[n];
	int avg;
 void readDetails()
 {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the student details");
	 System.out.println("Enter the Number of student = ");
	 n=sc.nextInt();
	 System.out.println("Enter the Student hight = ");
	 for(int i=0;i<noOfStudent.length;i++)
	 {
	 noOfStudent[i]=sc.nextInt();
	 }
	 System.out.println("hight of students are");
	 for(int s:noOfStudent)
	 {
		 System.out.println(s);
	 }
 }
 void printAverageHight() {
	 for(int i=0;i<noOfStudent.length;i++)
	 {
		 avg=noOfStudent[i]/noOfStudent.length;
	 }
	 System.out.println("The totak average hight is"+avg);
 }
}
