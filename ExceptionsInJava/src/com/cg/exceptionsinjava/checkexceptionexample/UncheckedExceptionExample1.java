package com.cg.exceptionsinjava.checkexceptionexample;

import java.util.Scanner;

public class UncheckedExceptionExample1 {

	
static String s; //="Hello";
static Scanner sc= new Scanner(System.in);
		public static void main(String[] args) {
	    
	    try {
	    	System.out.println("Enter the String ....");
	    	s=sc.nextLine();
	    	System.out.println("Enter the inex to pick a charater from above string...");
	    	int i= sc.nextInt();
	    	//if we want to print our own message at exception
	    	if(i>s.length()-1) {
	    		throw new StringIndexOutOfBoundsException("i valeue is greater than Index of String");
	    	}else {
			    System.out.println("charAt method = "+ s.charAt(8));

	    	}
	    	

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	    
		}
}
