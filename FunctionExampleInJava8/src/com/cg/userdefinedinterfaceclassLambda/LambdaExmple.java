package com.cg.userdefinedinterfaceclassLambda;

import com.cg.userdefinedinterfaceclass.Add;
import com.cg.userdefinedinterfaceclass.Div;
import com.cg.userdefinedinterfaceclass.Message;
import com.cg.userdefinedinterfaceclass.Sub;
public class LambdaExmple {

	public static void main(String[] args) {

		Add ad =() -> System.out.println("Addition of two numbers using Lambda Exapression");
		ad.add();
		
		Sub sb = (x,y) -> System.out.println("Substraction of two numbers");
	 
	     Sub sb1 =(x,y) -> {
	    	 if(x>y) {
	    		 System.out.println("Susbtraction = "+(x-y));
	    	 }else {
	    		 System.out.println("else bloc substraction = "+(y-x));
	    	 }
	     };
	     sb1.sub(12,13);
	     
	     Div dv =(a,b) -> {
	    	 if(a>b)
	    	 {
	    		return a/b;
	    	 }else
	    	 {
	    		 return b/a;
	    	 }
	     };
	     int result =dv.div(12, 6);
	     System.out.println("Result = "+result);
	     
	     Message ms1 =(quote) -> {
	         System.out.println("The message of the day is ="+quote);
	     };
	     ms1.thoughtOfTheDay("The journey of a thousand miles begins with one step.\r\n"
	     		+ "\r\n"
	     		+ "Lao Tzu");
	}   

}
