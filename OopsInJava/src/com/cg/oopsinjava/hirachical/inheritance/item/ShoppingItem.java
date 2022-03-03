package com.cg.oopsinjava.hirachical.inheritance.item;

import java.util.Scanner;

public class ShoppingItem {
	ShoppingItem[] shop=new ShoppingItem[30];
	ShoppingItem shopping;
	Book[] bk=new Book[30];
	Book book;
	Item[] it=new Item[30];
	Item item;
	Mp3[] m=new Mp3[30];
	Mp3 mp3;
	DVD[] dv=new DVD[30];
	DVD dvd;
	Scanner sc=new Scanner(System.in);
	
	int noOfItems;
	 char ch ='y';
	 void shopping() {
		 while(ch =='y') {
			 System.out.println("Enter the choice.....");
			 System.out.println("add: to Add the item to shpping basket..");
			 System.out.println("remove: remove the Item from shopping basket");
			 System.out.println("search: Search Item in SHopping Basket");
				sc.nextLine();
			 String choice=sc.nextLine();
			 switch (choice) {
			 case "add":
				 addToShoppindBasket();
					break;
			 case "remove":
				 removeFromShoppingBasket();
					break;
			 case "search":
				 searchItemInShoppingBasket();
					break;
					
			default:
				System.out.println("Not a proper choice");
				break;
			}
			 System.out.println("Do you want to continue....");
			 System.out.println("Enter 'y' to continue ......");
				ch =sc.next().charAt(0);
		 }//closing While
	 } 
	 
	 void addToShoppindBasket() {
		 System.out.println("Enter the Product Details....");
	     System.out.println("Enter the number of Item to add");
	     noOfItems=sc.nextInt();
	      for(int i=0;i<noOfItems;i++)
	      {
	    	  dvd =new DVD();
	    	  dvd.readItemDetails();
	    	  dvd.readTrailer();
	    	  dvd.viewFullDescription();
	    	  dvd.viewTrailer();
	    	  dv[i]=dvd;
	      }
	 }
	 void removeFromShoppingBasket()
	 {
		 System.out.println("Enter the Item details ");
		    System.out.println("Enter the Item name to serach");
		    String na=sc.nextLine();
		    for(int i=0;i<noOfItems;i++)
		    {
		    	 if(dv[i].name.equals(na)) {
		    		 dv[i]=null;
		    		 break;
		    	 }else {
		    		 System.out.println("Item not found.......");
		    	 }
		    }	}
	 int count=0;
		int j=0;
	 void searchItemInShoppingBasket() {
		 System.out.println("Enter the product details");
		 System.out.println("Enter the product name to serch...");
		String  ina=sc.nextLine();
	      for(int i=0;i<noOfItems;i++)
	      {
	    	  if(dv[i].name.equals(ina)) {
	    		  count++;
	    		  j=i;
	    	  }
	      }
	      if(count>1) {
	    	  System.out.println("Item found ......");
	    	  dv[j].viewTrailer();
	      }else {
	    	  System.out.println("Item not found .....");
	      }
	 }
}
