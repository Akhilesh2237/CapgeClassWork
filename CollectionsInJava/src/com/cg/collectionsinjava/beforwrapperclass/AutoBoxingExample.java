package com.cg.collectionsinjava.beforwrapperclass;

public class AutoBoxingExample {

	public static void main(String[] args) {

		int i=45;
		System.out.println(i);
		//Equivalent code of autoboxing by compiler
		Integer value=new Integer(i);
		System.out.println(value.intValue());
	}

}
