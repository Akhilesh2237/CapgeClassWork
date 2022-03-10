package com.cg.collectionsinjava.arraylistecaple;

import java.util.HashSet;
import java.util.Scanner;

public class SetDemo {

	public static void main(String[] args) {
      HashSet<Integer> numbersSet =new HashSet<Integer>();
      Scanner sc= new Scanner(System.in);
      System.out.println("Enter the Size of Hash set ....");
      int n=sc.nextInt();
      System.out.println("Enter the values to insert the HashSet...");
     for(int i=0;i<n;i++)
     {
    	 numbersSet.add(sc.nextInt());
     }
     System.out.println(numbersSet);
     System.out.println("Values in HashSet....");
      for(Integer intValue :numbersSet) {
    	  System.out.println(intValue);
      }
      
	}

}
