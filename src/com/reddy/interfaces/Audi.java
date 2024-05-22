package com.reddy.interfaces;

public class Audi implements FnCar { //Audi implemets FNCa only so if we need more like toyota, maruti etc we can develope with anonymous class

	

	@Override
	public void drive() {
		System.out.println("sdfjosou");// we are using it only one place so to improve it with multiple implemetation we can use anonymous class
		
	}

}
