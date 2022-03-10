package com.cg.exceptionsinjava.checkexceptionexample;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CheckExceptionExample {

	public static void main(String[] args) throws IOException {
		writeInToFile();
		
		readFromFile();
	}
  
	public static void writeInToFile() throws IOException {
		//Unhandled exception type IOException
		BufferedWriter bw = new BufferedWriter(new FileWriter("myfile.txt"));
        bw.write("Welcome");
        bw.close();
	}
	public static void readFromFile() throws IOException {
		//Unhandled exception type IOException
		BufferedReader br = new BufferedReader(new FileReader("myfile.txt"));
        int i;
        while((i=br.read())!=-1) {
        	//System.out.println(i +" ");
        	
        	System.out.println((char)i);
        	
        }
        System.out.println();
        System.out.println();
        br.close();
	}
	
}