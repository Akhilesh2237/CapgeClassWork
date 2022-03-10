package com.cg.akhilesh.hashmapExample1;

import java.util.Collection;
import java.util.HashMap;
import java.util.TreeSet;

public class StudentDetails {

	public static void main(String [] args) {
		
		HashMap<String,Float> studentDetails=new HashMap<String,Float>();
		studentDetails.put("Rama", 40.0f);
		studentDetails.put("Rma", 40.0f);
		studentDetails.put("Ram", 40.0f);
		studentDetails.put("Roma", 40.0f);

		Collection<Float> std_Marks = studentDetails.values();
		float sum =0.0f;
		for(Float marks :std_Marks)
		{
			sum+=marks.floatValue();
		}
		System.out.println("The sum of marks is "+ sum);
		System.out.println("The Average marks is "+ sum/std_Marks.size());
		
		TreeSet<Float> sorted_stdMarks = new TreeSet<Float>();
		sorted_stdMarks
	}
}
