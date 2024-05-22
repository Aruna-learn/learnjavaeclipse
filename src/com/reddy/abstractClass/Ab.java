package com.reddy.abstractClass;

public class Ab  extends AppleAb{

	@Override
	public void cut() {
		System.out.println("Cut");//we are showing the implementation for cut method so as per abstarction if we show the impletation details then percentage of abstarctiob will reduce 
	}

	@Override
	public void keyboard() {
System.out.println("Keyboard");	
	}

}
