package com.cg.breakexample;

public class Break {

	public static void main(String[] args) {
// using break as a civilized form of goto
		
		boolean t=true;
		first:
		{
			second:
			{
				thired:{
					System.out.println("Before the break.");
					if(t) break second;//break out of second block
					System.out.println("this wont execute ");

				}
				System.out.println("this will also wont execute");
			}
			System.out.println("This is after second block");
		}
	
	}

}
