package loopsinjava;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysAndForEach {

	public static void main(String[] args) {
       int [] values=new int[6];
       //store and read the values from keyboard
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the values of Array");
      for(int i=0;i<values.length;i++) {
       values[i]=sc.nextInt();
	}
      Arrays.sort(values);
	//reading the array vaues for each from array to display
	System.out.println("Values of Array....");
	for(int arrayvalue:values)
	{
		System.out.println(arrayvalue);
	}

}
}