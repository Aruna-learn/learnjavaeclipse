package com.Multithreading;

public class TestThread3 {
//Runnable is a functional interface so we can use anonymous classes and we have better option called lambda so we can use tht in next program TestThread4
	public static void main(String[] args) {
		Runnable r=new Runnable() {
			public void run() {
				System.out.println("Aonymous" +Thread.currentThread().getName() + ">>" + Thread.currentThread().getId());
			}
		};

		Thread t1=new Thread(r, "T1");
		//System.out.println(t1.getState());
		t1.start();		
		//System.out.println(t1.getState());

		System.out.println(Thread.activeCount());
		//System.out.println(t1.getState());

	}

}

//thread life cycle 0-new
//1.active/runnable
//2-blockied
//4-waiting join
//4.waiting time
//terminates
