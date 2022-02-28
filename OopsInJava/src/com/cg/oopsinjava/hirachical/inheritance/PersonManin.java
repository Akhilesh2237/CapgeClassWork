package com.cg.oopsinjava.hirachical.inheritance;

public class PersonManin {

	public static void main(String[] args) {

		Student stu=new Student();
		stu.readPersonDetails();
		stu.readStudentDetails();
		stu.printPersonDetails();
		stu.printStudentDetails();
		
		Staff sta=new Staff();
		sta.readPersonDetails();
		sta.readStaffDetails();
		sta.printPersonDetails();
		sta.printStaffDetails();
	}

}
