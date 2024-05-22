package com.memorymanagement;

public class GarbageCollectionEx { 
	public void finalize() 
	{
		System.out.println("Garbage finaize");
	}

	public static void main(String[] args) {
		//un used objects
		//unreferenced objects
		//anonymous object
		
		
		
 GarbageCollectionEx gc1=new GarbageCollectionEx();//gc1, gc2, gc3 are reference variables
 
 GarbageCollectionEx gc2=new GarbageCollectionEx();

 GarbageCollectionEx gc3=new GarbageCollectionEx();
 
 //2ways to call garbage collector manually
 
 //Runtime.getRuntime().gc();
 gc1=null;//unreferenced objects
 gc2=gc3;
 
 new GarbageCollectionEx();//Anonymous object
 
 System.gc();
 
	}

}
