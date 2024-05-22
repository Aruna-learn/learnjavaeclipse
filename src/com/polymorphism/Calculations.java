package com.polymorphism;

public class Calculations {
	
	// Method overloading having methods same name and difference in parameters and data type
	public void add(int a, int b) {
	int sum=a+b;
	System.out.println("Sum of " + a + " and " + b + " is: " + sum);
		
	}
	public void add(int a, int b, int c) {
		int sum=a+b+c;
		System.out.println("sum of" +a+ "," +b+ "and" + c +" is:" +sum);
		
	}

	public static void main(String[] args) {
	   Calculations c=new Calculations();
 c.add(7, 0);
 c.add(8,9,0);
 
	  
	   
		
	}

}
