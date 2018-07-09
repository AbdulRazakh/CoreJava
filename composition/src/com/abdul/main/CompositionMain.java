package com.abdul.main;

public class CompositionMain {

	public static void main(String[] args) {
		
		Job job=new Job(01, "Software Engineer");
		Person peron=new Person(21, job);
		
		System.out.println("job is"+job);
		System.out.println("person is"+peron);

	}

}
/*Output is:
 * 
 * 

 * job isjob id is 1 and job name is Software Engineer
 
person isPerson id is 21 and Job description is
Composition is nothing but refering  objects in another class which helps in reusing of code

*/