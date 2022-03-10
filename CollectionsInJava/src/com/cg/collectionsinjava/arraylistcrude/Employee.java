package com.cg.collectionsinjava.arraylistcrude;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Employee {

	private int employeeId;
	private String employeeName;
	private Date employeeDob;
	private String employeeMobNo;
	private String employeeEmail;
	
	public Employee() {
		super();
	}

	public Employee(int employeeId, String employeeName, Date employeeDob, String employeeMobNo, String employeeEmail) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeDob = employeeDob;
		this.employeeMobNo = employeeMobNo;
		this.employeeEmail = employeeEmail;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public Date getEmployeeDob() {
		return employeeDob;
	}

	public void setEmployeeDob(Date employeeDob) {
		this.employeeDob = employeeDob;
	}

	public String getEmployeeMobNo() {
		return employeeMobNo;
	}

	public void setEmployeeMobNo(String employeeMobNo) {
		this.employeeMobNo = employeeMobNo;
	}

	public String getEmployeeEmail() {
		return employeeEmail;
	}

	public void setEmployeeEmail(String employeeEmail) {
		this.employeeEmail = employeeEmail;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeDob=" + employeeDob
				+ ", employeeMobNo=" + employeeMobNo + ", employeeEmail=" + employeeEmail + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	Scanner sc=new Scanner(System.in);
	//Methods to acess above variables
	public void readEmployeeDetails() {
     try {
		System.out.println("Enter Employee data...");
		System.out.println("Enter Employee Id");
		employeeId=sc.nextInt();
		System.out.println("Enter the Employee Name ");
		employeeName=sc.nextLine();
		System.out.println("Enter the Employee DOB in 'dd/mm/yyyy' ");
		String dob=sc.nextLine();
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Enter Employee Mobile Number");
		employeeMobNo=sc.nextLine();
		if(employeeMobNo.matches("\\d{10}")) {
			System.out.println("Mobile Number is valid");
		}else {
			System.out.println("Entered Mobile number is not valid ...");
			System.out.println("Do you want to Enter the Mobile Number which is Valid (y/n)..");
			char ch=sc.next().charAt(0);
			if(ch=='y')
			{
				System.out.println("Enter mobile number in specified format (ex:- 07892333222 / 917892333222)");
				sc.nextLine();
				employeeMobNo =  sc.nextLine();
			}else {
				System.out.println("Thank you for providing your details....");
			}
		}
		System.out.println("Enter the Employee email .....");
		employeeEmail =sc.nextLine();
		if(validate(employeeEmail)) {
			System.out.println("Thank you for providing correct email....");
		}else {
			System.out.println("Enter email in specific format(ex:- akhilesh@gmail.com)");
		}
	}catch (Exception e) {
		e.printStackTrace();
 	}
	}
	@SuppressWarnings("deprecation")
	void displayEmployeedetails() {
		System.out.println("Enter the Employee data ......");
		System.out.println("Employee Id = "+employeeId);
		System.out.println("Employee Name ="+employeeName);
		System.out.println("Enter the Employee date of birth= "+employeeDob);
		System.out.println("Enter the Employee Mobile Number= "+employeeMobNo);
		System.out.println("Enter the employee email address = "+employeeEmail);
	}
		boolean checkMobileNumber(String mobNo) {
			Pattern ptrn = Pattern.compile("(0/91)?[7-9][0-9]{9}");
			Matcher match = ptrn.matcher(mobNo);
			return (match.find() && match.group().equals(mobNo));
	}
}
