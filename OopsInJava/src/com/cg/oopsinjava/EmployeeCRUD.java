package com.cg.oopsinjava;

import java.text.ParseException;
import java.util.Scanner;

public class EmployeeCRUD {
    Employee[] listOfEmployees = new Employee[30];
    Employee employee;
	Scanner sc=new Scanner(System.in);
	int noOfEmployee;
	char ch ='y';
	public void menu() throws ParseException
	{
		while(ch =='y') {
		System.out.println("Enter the choice.....");
		System.out.println("add: to Add the employee details");
		System.out.println("update: to update the employee details");
		System.out.println("delete: to delete the employee in the array");
		System.out.println("display: to display all employees");
		System.out.println("search: to search for a employee");
		sc.nextLine();
	String choice=sc.nextLine();
	switch (choice) {
	case "add":
		addEmployee();
		break;
	case "update":
		updateEmployee();
		break;
	case "delete":
		deleteEmployee();
		break;
	case "display":
		displayEmployee();
		break;
	case "search":
		searchEmployee();
		break;
	default:
		System.out.println("Not a proper choice");
		break;
	}
	System.out.println("Do you want to continue....");
	System.out.println("Enter 'y' to continue ......");
	ch =sc.next().charAt(0);
	
		}//closing while 
	}
	int count=0;
	int j=0;
	 void searchEmployee() {
		 System.out.println("Enter the employee details");
		 System.out.println("Enter the Employee Id to serch...");
		int  eId=sc.nextInt();
	      for(int i=0;i<noOfEmployee;i++)
	      {
	    	  if(listOfEmployees[i].employeeId==eId) {
	    		  count++;
	    		  j=i;
	    	  }
	      }
	      if(count>1) {
	    	  System.out.println("Employee found ......");
	    	  listOfEmployees[j].displayEmployeeDetails();
	      }else {
	    	  System.out.println("Employee not found .....");
	      }
	}
	 void displayEmployee() {
		System.out.println("Enter the Employee Id to display:");
	      for(int i=0;i<noOfEmployee;i++)
	      {
	    	  if(listOfEmployees[i]==null) {
	    		  continue;
	    	  }
	    	  listOfEmployees[i].displayEmployeeDetails();
	      }
	      
	}
	 void deleteEmployee() {
    System.out.println("Enter the employee details ");
    System.out.println("Enter the Employee Id to serach");
    int eId=sc.nextInt();
    for(int i=0;i<noOfEmployee;i++)
    {
    	 if(listOfEmployees[i].employeeId==eId) {
    		 listOfEmployees[i]=null;
    		 break;
    	 }else {
    		 System.out.println("Employee not found.......");
    	 }
    }	}
    void updateEmployee() {
System.out.println("Enter employee details to update");
   int  eId=sc.nextInt();
   for(int i=0;i<noOfEmployee;i++)
   {
	   if(listOfEmployees[i].employeeId==eId)
	   {
		   System.out.println("Enter the new details of employee");
		   System.out.println("Enter the new email address of employaa..");
		   sc.nextLine();
		   listOfEmployees[i].employeeEmail = sc.nextLine();
		   break;
	   }else {
		   System.out.println("Student Not Found ......");
	   }
   }
	}
	void addEmployee() throws ParseException {
     System.out.println("Enter the Employee Details....");
     System.out.println("Enter the number of Employees to add");
      noOfEmployee=sc.nextInt();
      for(int i=0;i<noOfEmployee;i++)
      {
    	  employee =new Employee();
    	  employee.readEmployeeDetails();
    	  listOfEmployees[i]=employee;
      }
	}

}
