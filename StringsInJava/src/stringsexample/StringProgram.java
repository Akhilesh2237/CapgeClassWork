package stringsexample;

import java.util.Scanner;

public class StringProgram {

	public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the value of String = ");
     String str=sc.nextLine();
     System.out.println(str);
     int count=1;
     for(int i=0;i<str.length();i++)
     {
 if((str.charAt(i)==' ')&& (str.charAt(i+1)!=' '))
 {
	 count++;
 }
     }
     System.out.println("Number of words in a String is "+count);
     
     String[] words= str.split(" ");
     for(String w:words)
     {
    	 System.out.println(w);
        
     }
    
	}

}
