package arrayshandson2;

import java.util.Scanner;

public class SameElementArray {

	public static void main(String[] args) {
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter the value of Array");
 int n=sc.nextInt();
 int arr[]=new int[n];
 boolean isCheck=false;
 for(int i=0;i<arr.length;i++)
 {
 arr[i]=sc.nextInt();
 }
 for(int i=0;i<arr.length;i++)
 {
	 for(int j=n-1;j>0;j--)
	 {
		 if(arr[i]==arr[n-1])
		 {
			 isCheck=true;
		 }
	 }
	
 }
 if(isCheck)
 {
	 System.out.println("the array value is same");
 }else
 {
	 System.out.println("the value is not same ");
 }
	}

}
