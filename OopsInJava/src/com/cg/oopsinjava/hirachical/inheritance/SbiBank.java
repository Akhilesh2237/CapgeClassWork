package com.cg.oopsinjava.hirachical.inheritance;

public class SbiBank extends Bank {
	
	String category;
void calculatingRateOfIntrest() {
	
	System.out.println("Enter the category General or Senior Citizens");
	category=sc.nextLine();
	if(category.equals("General"))
	{
		switch (time) {
		case 1:
			rateOfIntrest=principal*time*5.20f;
			System.out.println("the Rate If Interest is " + rateOfIntrest);
			break;

		default:
			break;
		}
		rateOfIntrest=principal*time*5.20f;
		System.out.println("the Rate If Interest is " + rateOfIntrest);
	}if(category.equals("Senior Citizens"))
	rateOfIntrest=principal*time*annualRateOfInterst;
	System.out.println("the Rate If Interest is " + rateOfIntrest);
	
}
}
