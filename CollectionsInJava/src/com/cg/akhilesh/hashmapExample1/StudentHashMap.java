package com.cg.akhilesh.hashmapExample1;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;


public class StudentHashMap {
	
public static void main(String[] args) {
	HashMap<String,Student> studentDetails=new HashMap<String,Student>();
	 Student std1= new Student("Raj",40.0f);
	 Student std2= new Student("Rahul",47.8f);
	 Student std3=new Student ("Akash",56.5f);
	 Student std4= new Student("Rajesh",36.8f);
	 studentDetails.put("1 ", std1);
	 studentDetails.put("2 ", std2);
	 studentDetails.put("3 ", std3);
	 studentDetails.put("4 ", std4);

	 System.out.println(studentDetails);
	 
	 //Retrieving only keys using keySet()
	 
	Set<String> studentDetails_keys=studentDetails.keySet();
	
	System.out.println("Student key  are....");
	
	for(String i:studentDetails_keys )
	{
		System.out.println(i);
		
	}
	
	
	//Retrieving only keys using values()
	Collection<Student> stde_v = studentDetails.values();
	float sum=0;
	for(Student i:stde_v ) {
		System.out.println(i.getStudentMarks());
		 sum += i.getStudentMarks(); 
	}
		System.out.println(sum);
	System.out.println("Average = "+ (sum/stde_v.size()));
	
	 TreeSet<String> ts=new TreeSet<String>();
	 
}
}
