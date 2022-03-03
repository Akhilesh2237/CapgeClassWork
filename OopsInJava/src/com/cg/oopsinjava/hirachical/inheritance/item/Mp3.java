package com.cg.oopsinjava.hirachical.inheritance.item;

public class Mp3 extends Item{
 String artist;
 int duration;
 
 void play() {
	 System.out.println("Enter the artist detail ");
	 artist=sc.nextLine();
	 System.out.println("Enter the duration ");
	 duration=sc.nextInt();
 }
 void download() {
	 System.out.println("artist name = "+artist);
	 System.out.println(" duration = "+duration);

 }
}
