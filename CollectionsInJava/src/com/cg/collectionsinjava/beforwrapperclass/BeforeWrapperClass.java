package com.cg.collectionsinjava.beforwrapperclass;

public class BeforeWrapperClass {

	public static void main(String[] args) {

		int i=30;
		//boxing to object 
		Integer value=new Integer(i);
		//unboxing from object before java file 
		System.out.println(value.intValue());
	}

}
