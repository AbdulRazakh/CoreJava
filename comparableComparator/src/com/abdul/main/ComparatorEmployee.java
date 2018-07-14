package com.abdul.main;

public class ComparatorEmployee {
	
	int empId;
	String firstName;
	String lastName;
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
		return lastName;
	}
	public ComparatorEmployee(int empId, String firstName, String lastName) {
		super();
		this.empId = empId;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	@Override
	public String toString() {
		return "ComparatorEmployee [empId=" + empId + ", firstName="
				+ firstName + ", lastName=" + lastName + "]";
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
