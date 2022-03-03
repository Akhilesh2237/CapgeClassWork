package com.cg.discountsystem;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Visit extends Customer{
	Customer[] customer=new Customer[30];
	Customer cust;
	DiscountRate[] discount=new DiscountRate[30];
	DiscountRate disc;
  private Date date;
 private double serviceExpense;
 private double productExpence;
 String choice;
 char ch;
 int n;
 public void customerManagementSystem() {
 	while(ch=='y') {
 	System.out.println("Enter the choice ...");
 	System.out.println("add: to add the details..");
 	System.out.println("view: to view the details ");
 	switch (choice) {
 	case "add":
 		addCustomerDetails();
 		break;
 	case "view":
 		viewCustomerDetails();
 		break;
 	default:
 		break;
 	}
 	System.out.println("Enter the choice to continue...");
 	ch=sc.next().charAt(0);
 	}
 }

 
public Visit(String name, boolean member, String memberType, Date date, double serviceExpense, double productExpence) {
	super(name, member, memberType);
	this.date = date;
	this.serviceExpense = serviceExpense;
	this.productExpence = productExpence;
}



public Visit(String name, boolean member, String memberType) {
	super(name, member, memberType);
}



public Date getDate() {
	return date;
}



public void setDate(Date date) {
	this.date = date;
}



public double getServiceExpense() {
	return serviceExpense;
}



public void setServiceExpense(double serviceExpense) {
	this.serviceExpense = serviceExpense;
}



public double getProductExpence() {
	return productExpence;
}



public void setProductExpence(double productExpence) {
	this.productExpence = productExpence;
}

void addCustomerExpence() throws ParseException {
	System.out.println("Enter the expence details .....");
	System.out.println("Enter the date of Visit");
	String dob = sc.nextLine();
	SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
	date = sdf.parse(dob);
	System.out.println("Enter the Service Expence");
	serviceExpense=sc.nextDouble();
	System.out.println("Enter the Product Expence");
	productExpence=sc.nextDouble();

}

void getTotalExpense() {
	
}

  
}
