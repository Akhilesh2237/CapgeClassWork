package com.cg.oopsinjava.hirachical.inheritance.item;

public class DVD extends Item{

	String certificate;
	int duration;
	String actors;
	
	void readTrailer()
	{
		System.out.println("Enter the certificate");
		certificate=sc.nextLine();
		sc.nextLine();
		System.out.println("Enter the duration");
		duration=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the actors");
        actors=sc.nextLine();
	}
	void viewTrailer()
	{
		System.out.println("Certificate"+certificate);
		System.out.println(" Duration"+duration);
		System.out.println("Actors"+actors);

	}
}
