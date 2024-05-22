package com.Multithreading;

public class TestThread2 {
	//2nd way of thread is Runnable interface beacse morethan one interface can implemets in class

	public static void main(String[] args) {
		
		Student s=new Student();//runnable interface object
		Thread t1=new Thread(s);
		t1.start();
		
		Student1 s1=new Student1();
		Thread t2=new Thread(s1);
		t2.start();

	}

}




class Student implements Runnable{
	@Override
	public void run() {
		/*
		 * // we are using only one method and one time only calling so we are creating
		 * class stuudent for that its waste of time inordr to over come this we can use
		 * anonymous and lambda expresions because runnable is a functional interface
		 */		System.out.println("Runnable" +Thread.currentThread().getName() + ">>" + Thread.currentThread().getId());
	}
}

class Student1 implements Runnable{
	@Override
	public void run() {
		System.out.println("Runnable" +Thread.currentThread().getName() + ">>" + Thread.currentThread().getId());
	}
}