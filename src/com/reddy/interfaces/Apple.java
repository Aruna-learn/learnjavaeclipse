package com.reddy.interfaces;

public class Apple implements Laptop {

	@Override
	public void copy() {
		System.out.println("Apple Copy code");
		
	}

	@Override
	public void past() {
		System.out.println("Apple paste code");
		
	}

	@Override
	public void cut() {
		System.out.println("Apple cut code");
		
	}

	@Override
	public void keyboard() {
		System.out.println("Apple keyboard code");
		
	}
	
	@Override
	
 public void printing() {
	 System.out.println("Apple printing");
 }
}
