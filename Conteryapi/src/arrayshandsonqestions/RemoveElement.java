package arrayshandsonqestions;

import java.lang.reflect.Array;
import java.util.Scanner;

public class RemoveElement {
public static void main(String [] args)
{
	int[] elements=new int[]{1,2,5,6,9,3};
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the index to remove element");
	int rem=sc.nextInt();
	sc.close();
	int copy[]=new int[elements.length-1];
	for (int i = 0, j = 0; i < elements.length; i++) {
	    if (i != rem) {
	        copy[j++] = elements[i];
	    }
	    for(int l=0;l<copy.length;l++)
	    {
	System.out.println("the new elements are"+copy[l]);
	    }
}
}}
