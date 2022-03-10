package com.cg.exceptionsinjava.checkexceptionexample;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ExceptionHandalingPractice {
static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args)  {
		writeFileData();
		readFileData();
		
	}
	public static void writeFileData() {
		try {
			 FileWriter myWriter = new FileWriter("data.txt");
		      myWriter.write("What is Lorem Ipsum?\r\n"
		      		+ "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.");
		      myWriter.close();
		      System.out.println("Successfully wrote to the file.");
		} catch (IOException e) {
			System.out.println("An error accured. ");
			e.printStackTrace();
		}
	}
	public static void readFileData() {
		try {
			File f=new File("data.txt");     //Creation of File Descriptor for input file
		      String[] words=null;    //Intialize the word Array
		      FileReader fr=new FileReader(f);   //Creation of File Reader object
		      BufferedReader br=new BufferedReader(fr);  //Creation of BufferedReader object
		      String s;
		      int flag=0;  //Intialize the flag variable
		      while((s=br.readLine())!=null)
		      {
		         words=s.split(" ");   //Split the word using space
		         for(int i=0;i<words.length;i++)
		         {
		            for(int j=0;j<words[i].length();j++)
		            {
		               char ch=words[i].charAt(j);   //Read the word char by char
		               if(ch == 'a' || ch == 'e' || ch == 'i' ||ch == 'o' || ch == 'u')   //Checking for vowels
		               {
		                      flag=1; //If vowels persent set flag as one
		                 }
		            }
		            if(flag==1)
		            {
		               System.out.println(words[i].length());  //Print the vowels word
		            }
		            flag=0;
		         }
		      }System.out.println("the vovle is printed");
		      }
			
		 catch (IOException e) {
			System.out.println("An error accured. ");
			e.printStackTrace();
		}}}
		
	
	
	

