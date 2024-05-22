package com.reddy.interfaces;

public class User {
	public static void main(String[] args) {
		Apple apple=new Apple();
		apple.copy();
		apple.past();;
		apple.keyboard();
		
		
		Hp hp=new Hp();
		hp.copy();
		hp.past();;
		hp.keyboard();
		hp.security();
		
		Lenovo lenovo=new Lenovo();
		lenovo.copy();
		lenovo.cut();
		lenovo.keyboard();
		lenovo.security();// default keyword inside the classes
		Laptop.capture();// static keyword outside the world access, interfae 100percentage of abstraction
		
	}

}
