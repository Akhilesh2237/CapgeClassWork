package com.cg.java8features.methordreferanceexample;

public class MethordReferanceExample {
public static void main(String[] args) {
	/**
	 * Following line will copy the code of printMessage() methord 
	 * to showMessage() Methord of message Interface
	 * 
	 * :: syntax for methord referance.
	 */
	Message msg= ThoughtOfTheDay :: printMessage;
	msg.showMessage();
}
}
