package com.cg.akhilesh.hashmapExample2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;

import com.cg.akhilesh.hashmapExample1.Student;

public class EmployaaHashMap {
	HashMap<Integer, Employee> employee_details = new HashMap<Integer,Employee>();
	Collection<Employee> EmployeeDetails_Values = employee_details.values();

void readEmployeeDetails(){
	
	
	Employee emp1= new Employee(1,"Rahul",10000,20,"Sales","Manager");
	Employee emp2= new Employee(1,"Rajesh",12000,22,"E&tech","Manager");
	Employee emp3= new Employee(1,"Ram",15000,24,"IT","Manager");
	Employee emp4= new Employee(1,"Raman",100000,30,"All","CEO");
	
	employee_details.put(1, emp1);
	employee_details.put(2, emp2);
	employee_details.put(3, emp3);
	employee_details.put(4, emp4);
	System.out.println(employee_details);
}
public void printKeys() {
Set<Integer> EmployeeDetails_keys=employee_details.keySet();
	
	System.out.println("Student key  are....");
	
	for(Integer i:EmployeeDetails_keys )
	{
		System.out.println(i);
		
	}
}
	public void printEmployeeAverageOfAgeAndSalary() {
	
	float sum=0;
	int age=0;
	for(Employee i:EmployeeDetails_Values ) {
		System.out.println(i.getEmpSalary());
		System.out.println(i.getEmpAge());
		 sum += i.getEmpSalary(); 
		 age += i.getEmpAge();
	}
	System.out.println("Sum of employee salary= "+sum);
	System.out.println("The average age of employee= "+age);
	System.out.println("The average of salary is = "+sum/ EmployeeDetails_Values.size());
    System.out.println("The average of Age id = "+ age/EmployeeDetails_Values.size());
	}
	public void highestAge() {
    TreeSet<Integer> employeeAge = new TreeSet<Integer>();
    for(Employee emp: EmployeeDetails_Values)
    {
    	employeeAge.add(emp.getEmpAge());
    }
    System.out.println("Highest Age is = "+employeeAge.last() );
	}
	
	public void highestSalary() {
    TreeSet<Float> employeeSalary = new TreeSet<Float>();
    for(Employee emp: EmployeeDetails_Values)
    {
    	employeeSalary.add(emp.getEmpSalary());
    }
    System.out.println("Highest Salary is = "+employeeSalary.last() );
	}
	
	public void sortingEmployeeName() {
    System.out.println("Sorting employee Name .....");
    TreeSet<String> employeeName = new TreeSet<String>();
    for(Employee emp: EmployeeDetails_Values)
    {
    	employeeName.add(emp.getEmpName());
    	
    }
    for(String employeeNames: employeeName)
    {
    	System.out.println(employeeName);
    }
	}
	
	public void shortingEmployeeDepartment() {
    System.out.println("Sorting employee Department .....");
    TreeSet<String> employeeDepaertment = new TreeSet<String>();
    for(Employee emp: EmployeeDetails_Values)
    {
    	employeeDepaertment.add(emp.getEmpDepartment());
    	
    }
    for(String employeeDep: employeeDepaertment)
    {
    	System.out.println(employeeDep);
    }
	}
	
    public void employeeWithCeoDesignation() {
    System.out.println("finding the employee details with CEO designation .....");
   ArrayList<String> employeedesign=new ArrayList<String>();
   for(Employee emp : EmployeeDetails_Values) {
	   employeedesign.add(emp.getEmpDesignation());
   }
   boolean i=false;
   for(String des:employeedesign)
   {
	   if(des.equals("CEO"))
	   {
		    i=true;
	   }
   }
   if(i==true)
   {
	   System.out.println("CEO Found");
   }else 
   {
	   System.out.println("CEO not Found !");
   }
   

   }}
