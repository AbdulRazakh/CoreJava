package com.abdul.main;

public class StaticMain {

	public static void main(String[] args) {
		
		Employee employee1=new Employee();
		employee1.empId=1;
		employee1.firstName="firstName";
		employee1.lastName="lastName";
		
		Employee employee2=new Employee();
		employee2.empId=2;
		employee2.firstName="firstName2";
		employee2.lastName="lastName2";
		
		System.out.println("employee1........"+employee1.empId+employee1.firstName+employee1.lastName+employee1.ceo);
		System.out.println("employee2........"+employee2.empId+employee2.firstName+employee2.lastName+employee2.ceo);
	}

}
class Employee{
	 int empId; //object specific attributes
	 String firstName;
	String lastName;
	static String ceo;
	
	static{
		System.out.println("Static block 1");
		Employee.ceo="Abdul";
		
	}
	public Employee() {
		System.out.println("Employee is in Constructor");
	}
	static{
		System.out.println("Static 2 is calling....");
		
	}
	
}
/*Static block 1
Static 2 is calling....
Employee is in Constructor
Employee is in Constructor
employee1........1firstNamelastNameAbdul
employee2........2firstName2lastName2Abdul
Static keyword is used when we have to share a common value with all the objects then we can go for static
it is associated with class rather than object
static block is executed without creating object it order of execution is the order that we define


*/