package com.cg.accessmodifiers;

import java.util.Scanner;

public class Utility {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number");
int no=sc.nextInt();
int temp=0;
for(int i=2;i<no-1;i++)
{
if(no%i==0)
{
	System.out.println("Number is not a prime number");
	break;
}else {
	System.out.println("Number is prime");
	break;
}
}
	}

}
