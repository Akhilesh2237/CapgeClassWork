package com.cg.collectionsinjava.arraylistecaple;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		//int [] arr= new int[100];
        ArrayList arr= new ArrayList();
        //ArrayList is a raw type. References to generic type ArrayList<E> should be parameterized
        arr.add("Rama");
        arr.add(1234);
        arr.add("345.678f");
        arr.add("false");
        System.out.println(arr);
        
        for(String string :arr) {
        	System.out.println(string);
        }
        System.out.println("arrayList eliments at position ");
        System.out.println();
        System.out.println();
        System.out.println("ArrayList size = " + arr.size());
        System.out.println();
        System.out.println();
        System.out.println("Array elemments retriving using size methord");
        for()

	}

}
