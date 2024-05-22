package com.thiskeyword;

import java.util.Arrays;

public interface Vehicle {
	String vehiclename="Royal";
	public void breaks();
	
	 default void stearing() {
	System.out.println(Arrays.toString(this.getClass().getDeclaredMethods()));

}
}