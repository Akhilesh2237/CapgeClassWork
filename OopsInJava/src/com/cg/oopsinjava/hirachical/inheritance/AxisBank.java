package com.cg.oopsinjava.hirachical.inheritance;

public class AxisBank extends Bank{

	void calculatingRateOfIntrest() {
		
		rateOfIntrest=principal*time*annualRateOfInterst;
		System.out.println("the Rate If Interest is " + rateOfIntrest);
		
	}
}
