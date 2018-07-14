package com.abdul.main;

public class ObjectMain {

	/**
	 * @param args
	 * @throws CloneNotSupportedException 
	 */
	/**
	 * @param args
	 * @throws CloneNotSupportedException
	 */
	public static void main(String[] args) throws CloneNotSupportedException {
		
		
		Employee emp=new Employee();
		Employee emp1=new Employee();
		/* methods getClass*/
		System.out.println("Class Name"+emp.getClass());
		System.out.println("class canonical"+emp.getClass().getCanonicalName());
		System.out.println("class classloader"+emp.getClass().getClassLoader());
		
		/*Clone*/
		emp.setEmpId(1);
		emp.setFirstName("Abdu");
		emp.setLastName("Razakh");
		emp1=(Employee) emp.clone();
		System.out.println("Clone example"+emp1.clone().toString());
		
		//toString() method
		System.out.println("toString()"+emp.toString());
		
		//hashCode()
		System.out.println("hashCode"+emp.hashCode());
		
		//equals method
		System.out.println("equals method"+emp.equals(emp1));
		
		//wait()
		//notify()
		//notifyAll()
		//finalize()
		

	}

}
/*Output
 * Class Nameclass com.abdul.main.Employee
 
class canonicalcom.abdul.main.Employee
class classloadersun.misc.Launcher$AppClassLoader@73d16e93
Clone exampleEmployee [empId=1, firstName=Abdu, lastName=Razakh]
toString()Employee [empId=1, firstName=Abdu, lastName=Razakh]
hashCode-1790985375
equals method true
Object class is a super class of all the classes eventhough if we wont specify extend Object class it will 
be implicitly extends object class
it contains 9 method
1)getClass()
2)clone()
3)equals()
4)hashCode()
5)toString()
6)wait()
7)notify()
8)notifyAll()
9)finalize()


1)getClass()-method
it used to get class related info 

2)Clone()
it is used to clone an object to make copy of objects

to use this we should necessarily implements Cloneable interface

3)equals()
to compare to objects are equal or not 
to use this we should override both toString and hashCode method

4)hashCode()
to get hashCode reference of objects

5) toString()
String representation of an object()

6) wait()
to enter wait state for necessary period of time of an object it should be in sychronized block

7) notify()

to notify other object about its state for particular object it should be in sychronized block
 
8) notifyAll()

to notify all the object about its state for particular object it should be in sychronized block

9) finalize()

it is called before the garbage collection we can write some code to remove resources before it is garbage collected






*/