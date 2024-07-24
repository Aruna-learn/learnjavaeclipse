package com.typecastingtypeconversion;

public class Exampletyep {
	
	void sum(int a,long b){
		System.out.println("a method invoked");
		}  
	  void sum(long a,int b){
		  System.out.println("b method invoked");
		  }  
	  

	public static void main(String[] args) {
		
		
		Exampletyep ex=new Exampletyep();
		//ex.sum(20, 20);
		System.out.println(ex);
	}

}
