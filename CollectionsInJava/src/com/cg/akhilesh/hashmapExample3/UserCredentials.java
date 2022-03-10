package com.cg.akhilesh.hashmapExample3;

import java.util.Scanner;

public class UserCredentials {
String userName;
String password;
Scanner sc=new Scanner(System.in);

public void readUserName() {
	System.out.println("Enter the user details ....");
	System.out.println("Enter the User name ");
	userName=sc.nextLine();
	let userName = /^[a-z][a-z]+\d*$|^[a-z]\d\d+$/i;
	System.out.println("Enter the password");
	password=sc.nextLine();
}
}
