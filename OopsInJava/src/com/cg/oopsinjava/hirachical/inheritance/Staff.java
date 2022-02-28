package com.cg.oopsinjava.hirachical.inheritance;

public class Staff extends Person{
 String school;
 double pay;
 
 void readStaffDetails() {
	 System.out.println("Enter the Staff details ");
	 System.out.println("Enter the School ");
	 school=sc.nextLine();
	 System.out.println("Enter the Staff Payment ");
     pay=sc.nextDouble();

 }
 void printStaffDetails() {
	 System.out.println("the School is = "+school);
	 System.out.println("the Payment = "+pay);

 }
}

