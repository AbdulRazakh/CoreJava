package com.abdul.main;

public class Person {
	
	// has a relationship
	private Job job;
	
	private int personId;
	public Person(int personId,Job job){
		this.personId=personId;
		this.job=job;
		
	}
	public int getPersonId() {
		return personId;
	}
	public void setPersonId(int personId) {
		this.personId = personId;
	}
	public Job getJob() {
		return job;
	}
	public void setJob(Job job) {
		this.job = job;
	}
	public String toString(){
		
		return String.format("Person id is %d and Job description is", personId,job);
	}
	

}
