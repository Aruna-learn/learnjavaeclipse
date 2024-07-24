package com.Multithreading;

public class Synchronization {

	public static void main(String[] args) throws Exception {
		BrickDiary bd=new BrickDiary();
		
		Runnable r=()->{
			for(int i =0;i<10000;i+=50) {
				//unloading the 50  bricks
				bd.incrementBrickcount();
			}
		};
		
		Runnable r1=()->{
			for(int i =0;i<10000;i+=50) {
				//unloading the 50  bricks
				bd.incrementBrickcount();
			}
		};
		
		Runnable r2=()->{
			for(int i =0;i<5000;i+=50) {
				//unloading the 50  bricks
				bd.incrementBrickcount();
			}
		};
		Thread t1=new Thread(r);
		Thread t2=new Thread(r1);
		Thread t3=new Thread(r2);
		
		t1.start();
		t2.start();
		t3.start();
		
		t1.join();
		t2.join();
		t3.join();

System.out.println(bd.brickcount);
	}

}


class BrickDiary{
	 volatile int brickcount=0;// we can use volatile
	public  synchronized void incrementBrickcount() {// we used to maintain no data loss
		synchronized(this) {// if we need some portion of code only need to be synchronized
		brickcount +=50;
	}
}
}