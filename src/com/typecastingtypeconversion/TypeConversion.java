package com.typecastingtypeconversion;

public class TypeConversion {

	public static void main(String[] args) {

		byte b=10;//-128 to 127 8bit
		short s=230;//-32,768 to 32,767 16bit
		int i=450;// 2,147,483,648 (-2^31) to 2,147,483,647 (2^31 -1)  32bit
		float f=21.5f;// 32bit
	//	long l=2334567;// 96bit -9,223,372,036,854,775,808(-2^63) to 9,223,372,036,854,775,807(2^63 -1)
		double d=43.89;//64bit
		
		char ch='A';
		boolean  bo=true;
		
		//Primitive data type int, byte, float converting from one data type to another
		//implici-low to high
		
//		l=i;
//		s=b;
//		d=i;// checks the range of d 1st and then check the value  of i so it is implicit
//		d=f;
//		f=s;
		
		
		//i=(int) l;//i<l so we are using here explicit by (int)
		b= (byte)f;
			
		
		b=(byte)i;//103 exceeds the range java start checking the range and prints
		//we can't convert boolean to to any type and vice versa
		
		
		//Type promotion(promotes to higher data type)
		//byte, short, char(less than interger) combination of operations promotes to int
		
		int b1=ch+s;
		// if greater than interger it promotes to highest data type
		
		//long b2=b+i+l;
		
	//	System.out.println(b2);
		
		
		//upcasting assig directly
		int i1=18;
		double d1=i1;
		System.out.println(d1);
		
		//downcasting typecast
		long l1=6754065;
		int i2=(int)l1;
		System.out.println(i2);
		
		
		
		
	}

}
