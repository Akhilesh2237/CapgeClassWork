package com.cg.oopsinjava.inheritance;

public class ContractHourlyEmployee extends HourlyEmployee {

	float noOfyears_Contract;
	float noOfYear_Completed;
	
	void readNoOfYears_Contract() {
		System.out.println("Enter the noOfyears_Contract");
		noOfyears_Contract=sc.nextFloat();
		
	}
	void isContractCompleted() {
		if(noOfYear_Completed==noOfyears_Contract)
		{
			System.out.prinln("Contract Completed");
		}else {
			System.out.println("Contract not Completed");
		}
	}
	
}
