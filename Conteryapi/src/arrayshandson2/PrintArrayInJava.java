package arrayshandson2;

import java.util.Scanner;

public class PrintArrayInJava {

	public static void main(String[] args) {
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter the 20 integers");
 int n=sc.nextInt();
 int[] arr=new int[n];
 for(int i=0;i<arr.length;i++)
 {
	 arr[i]=sc.nextInt();
 }
 for(int element:arr)
 {
	 System.out.println(element);
 }
 System.out.println("Check whether number is positive,negative,odd,even or 0s");
 for(int i=0;i<arr.length;i++)
 {
	 if(arr[i]>0)
	 {
		 System.out.println("Positive");
	 }if(arr[i]<0)
	 {
		 System.out.println("Negative");
	 }if(arr[i]==0)
	 {
		 System.out.println("Zero");
	 }
	 if(arr[i]%2==0)
	 {
		 System.out.println("Even number");
	 }
	 else {
		 System.out.println("Odd number");
	 }
	 
 }
	}

}
