package com.Multithreading;

public class TestThread4 {

	public static void main(String[] args) throws InterruptedException {
//		Runnable r=() -> System.out.println("Lambda" +Thread.currentThread().getName() + ">>" + Thread.currentThread().getId());
//			
//		
//		Thread t1=new Thread(r,"TTT");
//		t1.start();
//		System.out.println(Thread.activeCount());
//	
//
//	}
//}

//we can verify whether thread is working or executing or not , two threads exectuting simultanewosly
		Runnable r=() ->{
			for(int i=0;i<20;i++) {
		
			//System.out.println("Lambda" +Thread.currentThread().getName() + ">>" + Thread.currentThread().getId());
		}
		};
		
		Runnable r1=() ->{
			for(int i=0;i<20;i++) {
		
			//System.out.println("Lambda1" +Thread.currentThread().getName() + ">>" + Thread.currentThread().getId());
		}
		};
		
		Thread t1=new Thread(r,"TTT");
		System.out.println(t1.getState());
		t1.start();
		System.out.println(t1.getState());

		//t1.join();// 1st thread fully executes then 2nd thread will execute
		t1.sleep(10000);// stop thread for some time, after 10sec next tread will execute
		System.out.println(t1.getState());

		Thread t2=new Thread(r1,"TTT");
		t2.start();
		System.out.println(t1.getState());
t2.start();// if we start the thread again it will not start we get java.lang.IllegalThreadStateException
t2.notify();
t2.notifyAll();
t1.da
	}
}
