package com.reddy.interfaces;

public interface Laptop {

	public void copy();//abstract/unimplemented methods
	 
	public void past();
	
	public void cut();
	
	public void keyboard();
	
	default  void security() {  //implemented methods after 1.7 it.e in 1.8
		commonCode();// private method
		capture();// we can use static method in nonstatic methods
		System.out.println("Security");
	}

	 public void printing();
	 static void capture() {
		 commonCode();// we can't use private method in static so to over come we use static keyword
	
		// security();// we can't use non static method in static
		 System.out.println("capture picture");
	 }
	 private  static void commonCode() {
		 System.out.println("common");
	 
		 
	 }

	
}
