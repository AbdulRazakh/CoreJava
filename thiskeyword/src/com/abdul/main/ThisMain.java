package com.abdul.main;

public class ThisMain {

	public static void main(String[] args) {
		
		Student student=new Student(6);
		
		System.out.println("student value initialized"+student.x);
	}

}
class Student{
	
	int x;
	public Student(int x)//Constructor 
	{
		this.x=x;
	}
	
}
/*student value initialized6
 *this keyword is used to point to current instance of the object 
 * */
 