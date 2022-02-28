package com.cg.oopsinjava.inheritance;

public class PermanentEmployee extends Employee{
	float salaryPerMonth;
	float totalSalaryPerMonth;
	float noOfHoursWorked;
	
	void readSalaryPerMonth() {
		System.out.println("Enter the salary per hour ...");
		salaryPerMonth =sc.nextFloat();
		
	}
	void readnoOfHoursWorked() {
		System.out.println("Enter the noOfHoursWorked");
		noOfHoursWorked = sc.nextFloat();
	}
    void calculateSalary() {
    	totalSalaryPerMonth = salaryPerMonth*noOfHoursWorked;
    	System.out.println("Total Salary for week =" +totalSalaryPerMonth);
    }

}
