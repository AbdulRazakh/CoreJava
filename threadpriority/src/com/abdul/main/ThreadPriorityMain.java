package com.abdul.main;

class Hi extends Thread{
	
	public void run(){
		for(int i=0;i<5;i++){
			System.out.println("Hi");
		}
	}
}

class Hello extends Thread{
	
	public void run(){
		for(int i=0;i<5;i++){
			System.out.println("Hello");
		}
	}
}




public class ThreadPriorityMain {

	public static void main(String[] args) {
		
		Hi hi=new Hi();
		Hello hello=new Hello();
		hi.setPriority(Thread.MIN_PRIORITY);
		hello.setPriority(Thread.MAX_PRIORITY);
		hi.start();
		hello.start();
		
	}

}
/*output
 *
 * 
 * 
 * Hello
Hello
Hello
Hello
Hello
Hi
Hi
Hi
Hi
Hi
highest prioity value is 10 and minimum priority value is 1 and by normal the value will be 5
 * 
 * 
 * 
 * 
 * */
 