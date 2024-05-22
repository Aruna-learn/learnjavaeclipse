package com.typecastingtypeconversion;

import java.util.ArrayList;

public class WrapperClass {

	public static void main(String[] args) {
		int i=20;
		WrapperClass wc=new WrapperClass();
		//Integer i2=new Integer(i);// we can pass the value also boxing we are wraping the primitive data type
		
		//Integer i2=i;//autoboxing
		//Integer i2= Integer.valueOf(45);//boxing
		
		Integer i2=Integer.valueOf(90);
		int ii=i2;//auto unboxing
		System.out.println(i2);
		ArrayList<Integer> al=new ArrayList<>();
		al.add(12);// auto boxing
		al.add(56);
		al.add(Integer.valueOf(78));//boxing
		
		String s="99";
		Integer age=Integer.valueOf(s);// for wrapper class
		
		//int age=Integer.parseInt(s);// for primitive datatype
		
		
		

	}

}













//Primitive data type                          Wrapper classes
//byte                                             Byte
//short                                            Short
//int                                               Integer
//float                                            Float
//long                                              Long                                           
//double                                            Double
//char                                            Character
//boolean                                            Boolean
