package com.cg.oopsinjava.hirachical.inheritance;

import java.util.Scanner;

public class Bank {
float rateOfIntrest;
int principal;
float annualRateOfInterst;
float time;
Scanner sc=new Scanner(System.in);
void readrateOfIntrest() {
	System.out.println("Enter the details to calculate the Interst Value ");
	System.out.println("Enter the Principal Amount");
	principal=sc.nextInt();
	System.out.println("Enter the Annula rate of Interst");
	annualRateOfInterst=sc.nextFloat();
	System.out.println("Enter the Time (Duration)");
	time=sc.nextFloat();
}

void printrateOfInterst()
{
	System.out.println(" details to calculate the Interst Value ");
	System.out.println("Principal Amount = "+principal +"Rs.");
	System.out.println(" Annula rate of Interst = "+annualRateOfInterst+"%" );
	System.out.println(" Time (Duration)= "+time+"year");
}
}
