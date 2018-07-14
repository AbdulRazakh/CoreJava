package com.abdul.main;


public class Employee implements Comparable<Employee>/*,Comparator<Employee>*/{
	
	public Employee(int empId, String firstName, String lastName) {
		super();
		this.empId = empId;
		this.firstName = firstName;
		LastName = lastName;
	}
	int empId;
	String firstName;
	String LastName;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	@Override
	public int compareTo(Employee employee) {
		if(this.empId>employee.empId){
			return 1;
		}
		return -1;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", firstName=" + firstName
				+ ", LastName=" + LastName + "]";
	}
	/*@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return 0;
	}*/
	

}
