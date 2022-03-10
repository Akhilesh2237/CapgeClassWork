package com.cg.java8features.methordreferanceexample.instancemethord;

import com.cg.userdefinedinterfaceclassLambda.Addition;

public class InstanceMethordReferanceExample {

	public static void main(String[] args) {

		EpsonPrinter ep= new EpsonPrinter();
		Printer pr= ep::printUsingEpson;//choose which type of printer is to be users//which printer we have to call
		pr.printData();
		
		
		Addition ad= new Addition();
		Printer prAdd= ad :: add;
		prAdd.printData();
		
	}

}
