package stringsexample;

import java.util.Scanner;

public class StringsDemo {

	public static void main(String[] args) {
       //String str="This is a String";
      // String quote= new String("Strings in Java");
       char[] city= {'B','a','n','g','a','l','o','r','e'};
       String myCity=new String(city);
      /* 
       System.out.println(myCity.charAt(0));
       System.out.println(myCity.substring(5));
       System.out.println(myCity.substring(2,5));
       System.out.println(myCity.startsWith("A"));
       System.out.println(myCity.endsWith("e"));
       System.out.println(myCity.compareTo("Bangalore"));
       System.out.println("Mumbai".compareTo("Andhra Pradesh"));
       */
        /*String str="this is a String";
        String str1=new String("this is a String");
       System.out.println(str.concat("In Java, which is immutable"));
       System.out.println(str.equals("this is a String"));
       System.out.println(str1 =="this is a String");
       System.out.println(str.equals(str1));*/
    /*  String str="This is a String";
       String[] words = str.split(" ");
       System.out.println("String divided in to words...");
       for(String w:words)
       {
    	   System.out.println(w);
       }
       */
       
      //System.out.println("Find the index of character");
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the String");
      String message=sc.nextLine();//next is a methord to read the string through Scanner only it acept sentance without spaces
      System.out.println(message);
      System.out.println("Enter the character to check the index");
      char index=sc.next().charAt(0);
      int charIndex=message.indexOf(index);
      System.out.println("character at index" +index+" = " +charIndex);
      //System.out.println(message.contentEquals("Hello"));
      int charIndex1=message.indexOf(index);
      System.out.println("character at index" +index+"=" +charIndex1);
      System.out.println("length od String= "+message.length());
      
      char[] charsFromString= new char[10];
      message.getChars(2, 5, charsFromString, 0);
      System.out.println(charsFromString.length);
      System.out.println("Characters extracted from string using getChars() methord...");
      for(char ch:charsFromString) {
    	  System.out.println(ch);
      }
      //System.out.println(message.isBlank());
      System.out.println(message.isEmpty());
      System.out.println(message.replace('i','e'));
      //System.out.println(message.repeat(1));//it repeats the String based on the number of time input we have provided
      System.out.println(message.replaceAll(" ", "-"));
      //System.out.println(charsFromString.toString());
}
	}
