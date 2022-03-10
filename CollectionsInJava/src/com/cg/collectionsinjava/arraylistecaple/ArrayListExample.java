package com.cg.collectionsinjava.arraylistecaple;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListExample {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of element you want to enter");
		int n=sc.nextInt();
		ArrayList<Integer> arr= new ArrayList<Integer>(n);
		
		for(int i=0;i<+n;i++)
		{
			arr.add(i);
			
			//printing statement
			
		}
		for(int j:arr) {
			System.out.println(j);
		}
		System.out.println("Array list after shorting ");
		Collections.sort(arr);
		System.out.println(arr);
	        
	}

}
