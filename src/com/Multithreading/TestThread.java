package com.Multithreading;

public class TestThread {
	
	//1.Thread class extends-object creation for etened class-start- here using inheritance concept so all the methods in the thread will come to extended class and objects

	public static void main(String[] args) {
		
		
           System.out.println("1st method of threading Multithreading");

//           System.out.println(Thread.currentThread());
//           System.out.println(Thread.currentThread().getName());//main(java gives name default as main)-not main method(thread name the code is executing on method thread)
//           
//           System.out.println(Thread.currentThread().activeCount());//how many threads are in active 
//           System.out.println(Thread.currentThread().getId());
//           System.out.println(Thread.currentThread().getPriority());//5 (0 low 10max and here 5 is norml default value)
//           System.out.println(Thread.activeCount());
           
			/*
			 * Thread t1=new Thread();//thread is class so we created instance for thread
			 * class the thread will create t1.start();//to start thread
			 * 
			 * Thread t2=new Thread(); t2.start(); Thread t3=new Thread(); t3.start();
			 * Thread t4=new Thread(); t4.start();
			 * 
			 * System.out.println(Thread.activeCount());
		
			 */
		
		
		Employee e=new Employee("Aruna");
		e.start();
		
		Team t=new Team("Reddy");
		t.start();
		
		System.out.println("Inheritance employee thread");
		System.out.println(Thread.activeCount());
		
	}

}

class Employee  extends Thread{//1. way of thread implementaion inheritance concept is used for thread and create instance and start the thread
	
	public Employee(String name) {// constructor for name creation
		super(name);
	}
	@Override
	public void run() {
		System.out.println("inheritance" +Thread.currentThread().getName() + ">>" + Thread.currentThread().getId());
		
	}
	
}
class Team extends Thread{//inheritance concept is used for thread and create instance and start the thread
	
	public Team(String name) {// constructor for name creation
		super(name);
	}
	@Override
	public void run() {
		System.out.println("inheritance runnnn" +Thread.currentThread().getName() + ">>" + Thread.currentThread().getId());
		
	}
	
}
