package com.abdul.main;

public class MainStudent {

	public static void main(String[] args) {
		Student student=new Student();
		student.setStudentId(123);
		student.setFirstName("Abdul");
		student.setLastName("Razakh");
		
		System.out.println("studentId"+student.getStudentId());
		System.out.println("studentFirstName"+student.getFirstName());
		System.out.println("studentLastName"+student.getLastName());
	}

}


/*Encapsulation
 * Encapsulation is a process of hiding a class data from outside world
 * so we usually create the bean class with setters and getters to get the 
 * value and to set the value
 * we define attributes private 
 * we set and access these using  the methods which are public
 * 
 * 
 * */
 