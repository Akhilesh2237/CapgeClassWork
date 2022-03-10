package com.cg.exceptionsinjava.imppoint;

import java.util.Scanner;

public class Division {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		System.out.println("Entert the values");
		System.out.println("Enter A values");
		int a =sc.nextInt();
		System.out.println("Enter B values");
		int b=sc.nextInt();
		
		try {
			int c=a/b;
		} catch (Exception e) {
			e.fillInStackTrace();
		}finally {
			System.out.println("Finally block");
		}
		
	}

}
