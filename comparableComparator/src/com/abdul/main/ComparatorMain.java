package com.abdul.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorMain {

	public static void main(String[] args) {
		
		List<Employee> employee=new ArrayList<>();
		employee.add(new Employee(1, "Abdul", "Razakh"));
		employee.add(new Employee(4, "Abdul4", "Razakh4"));
		employee.add(new Employee(2, "Abdul2", "Razakh2"));
		employee.add(new Employee(3, "Abdul3", "Razakh3"));
		
		

		List<ComparatorEmployee> comparatorEmployees=new ArrayList<>();
		comparatorEmployees.add(new ComparatorEmployee(1, "Abdul", "Razakh"));
		comparatorEmployees.add(new ComparatorEmployee(4, "Abdul4", "Razakh4"));
		comparatorEmployees.add(new ComparatorEmployee(2, "Abdul2", "Razakh2"));
		comparatorEmployees.add(new ComparatorEmployee(3, "Abdul3", "Razakh3"));
		
		
		
		Collections.sort(employee);
		for(Employee e:employee  ){
			System.out.println(e.toString());
		}
		
		Comparator<ComparatorEmployee> emp=new Comparator<ComparatorEmployee>() {

			@Override
			public int compare(ComparatorEmployee o1, ComparatorEmployee o2) {
				if(o1.empId>o2.empId)
				return 1;
				else
					return -1;
			}
			
			
		};
		Collections.sort(comparatorEmployees, emp);
		System.out.println("Comarator Sort");
		for(ComparatorEmployee comparatorEmployee:comparatorEmployees){
			
			System.out.println(comparatorEmployee.toString());
		}
	}

}
/*output
 *Employee [empId=1, firstName=Abdul, LastName=Razakh]
Employee [empId=2, firstName=Abdul2, LastName=Razakh2]
Employee [empId=3, firstName=Abdul3, LastName=Razakh3]
Employee [empId=4, firstName=Abdul4, LastName=Razakh4]
Comarator Sort
ComparatorEmployee [empId=1, firstName=Abdul, lastName=Razakh]
ComparatorEmployee [empId=2, firstName=Abdul2, lastName=Razakh2]
ComparatorEmployee [empId=3, firstName=Abdul3, lastName=Razakh3]
ComparatorEmployee [empId=4, firstName=Abdul4, lastName=Razakh4]

comparable: user to sort list on a one signature
we have to implement comparable interface which has only one method compareTo
returns > +
< -
== 0
if we are consuming web service 
then we can use Comparator to sort 
Comparator is interface compare to compare 2 objects  which takes on parameter 
which has only one method compare
>+
<-
== 0


 * */
 