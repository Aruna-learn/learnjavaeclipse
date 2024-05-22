package com.reddy.interfaces;

public class FnUser {

	public static void main(String[] args) {
		FnCar c=new FnCar() {   // we have the car and we implement many car types using anonymous car

			@Override
			public void drive() {
				System.out.println("Audi car");
				System.out.println("Toyota car");// all sysout are different car implemetation so we can implement diffeerent like thar, bmw, maruti etc
				System.out.println("Thar car");
				System.out.println("BMW car");
				
				
			}
			
		};
		c.drive();
		

	}

}
