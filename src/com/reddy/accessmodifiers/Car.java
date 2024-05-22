package com.reddy.accessmodifiers;

public class Car {
	public static void main(String[] args) { //same package different class
		Student s=new Student();
		s.printrollNumber();
		System.out.println(s.rollNo);
	}

}
