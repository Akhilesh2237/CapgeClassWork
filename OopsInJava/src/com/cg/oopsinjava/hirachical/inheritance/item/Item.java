package com.cg.oopsinjava.hirachical.inheritance.item;

import java.util.Scanner;


public class Item {
 String name;
 String description;
 int price;
 Scanner sc=new Scanner(System.in);
 
 
 void readItemDetails() {
	 System.out.println("Enter the product details....");
	 System.out.println("Enter the name");
	 name=sc.nextLine();
	 System.out.println("Enter the description");
	 description=sc.nextLine();
	 System.out.println("Enter the price");
     price=sc.nextInt();
 }
 void viewFullDescription() {
	 System.out.println(" name = "+name);
	 System.out.println("description = "+description);
	 System.out.println(" price = "+price);
 }
 
 
 }

