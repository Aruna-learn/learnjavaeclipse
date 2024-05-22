package com.reddy.ExceptionHandling;

public class Example {

	public static void main(String[] args) {
		System.out.println("Program starts");
		int a=10;
		int b=0;
		int c=0;
		try {
			c=a/b;
		}
		catch(ArithmeticException ae) {// we take exception fro try and hold it
			//throw ae;// we are giving this exception to java, if we write like this it stops the exexution
			System.out.println("Error");
			throw ae;// we are giving this exception to java
			
		}
		finally {
			System.out.println("finally");
		}
		System.out.println("output is: " +c);
		System.out.println("Program ends");
	}

}
//Stack trace
/*
 * Exception name:java.lang.ArithmeticException exception msg: / by zero
 * exception line number:(Example.java:10) methods info: main method Exception
 * in thread "main" : exception in main method
 */