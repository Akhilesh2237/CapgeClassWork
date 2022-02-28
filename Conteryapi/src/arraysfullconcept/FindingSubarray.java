package arraysfullconcept;

import java.util.Scanner;

public class FindingSubarray {

	public static void main(String[] args) {
   int arr[]= {10, 12, 20, 30, 25, 40, 32, 31, 35, 50, 60};
   for(int i=0;i<arr.length;i++)
   {
	   System.out.print(" " +arr[i]);
   }
   int start,end;
   int n=arr.length;
   Scanner sc= new Scanner(System.in);
   System.out.println("Enter the starting index:");
   start=sc.nextInt();
   System.out.println("Enter the Last index");
   end=sc.nextInt();
   for(int i=arr[start];i<arr[start+end-1];i++)
   {
	  System.out.println(" "+arr[i]);
   }
  
	}

}
