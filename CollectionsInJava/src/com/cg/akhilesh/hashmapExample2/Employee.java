package com.cg.akhilesh.hashmapExample2;

import java.util.Scanner;

public class Employee {
private int empId;
private String empName;
private float empSalary;
private int empAge;
private String empDepartment;
private String empDesignation;
Scanner sc= new Scanner(System.in);


public Employee() {
	super();
}


public Employee(int empId, String empName, float empSalary, int empAge, String empDepartment, String empDesignation) {
	super();
	this.empId = empId;
	this.empName = empName;
	this.empSalary = empSalary;
	this.empAge = empAge;
	this.empDepartment = empDepartment;
	this.empDesignation = empDesignation;
}


public int getEmpId() {
	return empId;
}


public void setEmpId(int empId) {
	this.empId = empId;
}


public String getEmpName() {
	return empName;
}


public void setEmpName(String empName) {
	this.empName = empName;
}


public float getEmpSalary() {
	return empSalary;
}


public void setEmpSalary(float empSalary) {
	this.empSalary = empSalary;
}


public int getEmpAge() {
	return empAge;
}


public void setEmpAge(int empAge) {
	this.empAge = empAge;
}


public String getEmpDepartment() {
	return empDepartment;
}


public void setEmpDepartment(String empDepartment) {
	this.empDepartment = empDepartment;
}


public String getEmpDesignation() {
	return empDesignation;
}


public void setEmpDesignation(String empDesignation) {
	this.empDesignation = empDesignation;
}



@Override
public String toString() {
	return "Employee [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + ", empAge=" + empAge
			+ ", empDepartment=" + empDepartment + ", empDesignation=" + empDesignation + "]";
}


}
