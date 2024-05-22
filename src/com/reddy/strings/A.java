package com.reddy.strings;

//import java.util.Random;

/*public class Static {
       static int number; //int number;
	public static void main(String[] args) {
		Static sc=new Static();//creating object
		sc.number=new Random().nextInt();//calling nmber using the object
		
		Static sc1=new Static();
		sc1.number=new Random().nextInt();
		
		Static sc2=new Static();
		sc2.number=new Random().nextInt();
		
		System.out.println(sc.number);
		System.out.println(sc1.number);

		System.out.println(sc2.number);
		
	}

}*/

class A{  
	  static{
		  System.out.println("static block is invoked");
		  }  
	  public static void main(String args[]){  
	   System.out.println("Hello main");  
	  }  
	}  
