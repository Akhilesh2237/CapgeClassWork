package arrayshandson2;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class SubArrayIndex {
	public static void main(String[] args)
	{
		int[] array= new int[11];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of array");
		for(int i=0;i<array.length;i++)
		{
			array[i]=sc.nextInt();
		}
		System.out.println("value Inserted");
		for(int a:array)
		{
			System.out.println(a);
		}
		int start=3;int end=8;
		int newValue[]=new int[end-start+1];
		for(int i = start;i<end;i++)
		{
			newValue[i-start]=array[i];
     		}
		//Print value
		for (int v:newValue)
		{
			System.out.println(v+" ");
		}
	}
	}

