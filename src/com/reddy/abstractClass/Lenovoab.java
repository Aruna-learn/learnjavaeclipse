package com.reddy.abstractClass;

public abstract class Lenovoab implements Abstract{
	
	public void copy() {//  my implementation unsing 3rd part abstract class
		System.out.println("Lenovo Copy code");
		
	}

	public void past() {
		System.out.println("Lenovo paste code");
	}

    public abstract void cut();// abstract methods those not done by 3rd party
	
	public abstract void keyboard();

}
