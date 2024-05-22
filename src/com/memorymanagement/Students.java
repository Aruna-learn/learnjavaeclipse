package com.memorymanagement;

public class Students {
	String name="Aruna Reddy";

	public static void main(String[] args) {
		//Students s=new Students();
		//Students s;
		//s=new Students();//s is reference variable that stores the object address
		//object is referring to varaible called referred object if not referring anonymous object
		
//		new Students();//anonymous object// we are not referring and not storing address
//		s.greet();
		
		new Students().greet();// we can call  anonymous object like this
		
	}

	public void greet() {
		System.out.println("Hi "  +name);
	}
	
	
}
