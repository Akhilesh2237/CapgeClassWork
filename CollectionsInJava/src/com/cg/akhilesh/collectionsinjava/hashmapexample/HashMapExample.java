package com.cg.akhilesh.collectionsinjava.hashmapexample;

import java.util.HashMap;

import com.cg.collectionsinjava.hashmapexample.Employee;

public class HashMapExample {


	public static void main(String[] args) {
		
		HashMap<Integer, String> empDetails= new HashMap<Integer,String>();
		
		empDetails.put(123, "rama");
		empDetails.put(124, "Rahemm");
		empDetails.put(124, "Rah");

		System.out.println(empDetails);
		
		HashMap<Integer, String> empData= new HashMap<Integer,String>();
		System.out.println("After storing Employee value with a key....");
//creating employee objects to store in HashMap
		Employee emp1=new Employee(12345,"Rama");
		Employee emp2=new Employee(12346,"Akhilesh");
		Employee emp3=new Employee(12347,"Rohit");
		empData.put(1, emp1)
		System.out.println(empData);

	}

}
