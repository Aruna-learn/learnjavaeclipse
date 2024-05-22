package com.reddy.interfaces;

@FunctionalInterface  //java.util.function package to verify inbuilt functional interfaces
  public interface FnCar {
	  
       void drive();// only one abstract method and if we add more we get an error 
      
		/*
		 * default void stearing() { after java 1.8 it implements the non abstarct mentods default, static, lights
		 * 
		 * } static void breaks() {
		 * 
		 * } private void lights() {
		 * 
		 * }
		 */
}
