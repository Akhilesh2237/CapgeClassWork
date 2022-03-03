package com.cg.discountsystem;

import java.util.Scanner;

public class Customer {
private String name;
private boolean member;
private String memberType;
Scanner sc=new Scanner(System.in);
int n;

public Customer(String name, boolean member, String memberType) {
	super();
	this.name = name;
	this.member = member;
	this.memberType = memberType;
}


public Customer() {
	super();
}


public void addCustomerDetails() {
	System.out.println("Enter the number of customers to add:");
	n=sc.nextInt();
	for(int i=0;i<n;i++) {
	System.out.println("Enter the Customer details......");
	System.out.println("Enter the Name of the Customer = ");
	name=sc.nextLine();
	System.out.println("please enter true if alredy have membership = ");
	member=sc.nextBoolean();
	System.out.println("Enter the type of membership");
	memberType=sc.nextLine();
	}
	
}

public void viewCustomerDetails() {
	System.out.println("The Customer details are .....");
	System.out.println("the name of customer is "+ name);
	if(member==true) {
		System.out.println("you are the member");
	}else if(member==false) {
		System.out.println("Not a member");
	}
	System.out.println("the memberShip is = "+memberType);
	
	
}
}
