package com.LamdaExpressions;

public class LambdaEx {

	public static void main(String[] args) {
		//anonymous function/classes
		Lambda l=new Lambda() {

//			public void drive() {
//				System.out.println("drive safely reddy");
//				
//			}
//
//			
//
//			@Override
//			public void speed(int speed) {
//				System.out.println("speed important");
//				
//			}
//
//
//
//			@Override
//			public void student(int id, String name) {
//				System.out.println("aruna123");
//				
//			}
//
//

			@Override
			public int getSpeed() {
				System.out.println("aweywq");
				return 1000;
			}
			
		};
		
//		l.drive();
//		l.speed(56);
//		l.student(23, "aruna");
		System.out.println(l.getSpeed());
	

//		Audi a=new Audi();//tradition approach
//		a.drive();
//		a.speed(90);
//	    a.student(23,weurioqw);
	//System.out.println(a.getspeed(80));
		
		
		//Lambda expression ->
		//Lambda l1=()-> System.out.println("dsbodsi");for single line no need of braces

//		Lambda l1=()->{
//			int id=20;
//			System.out.println(id);
//			System.out.println("dbjodsf");for multiple lines we can use the curly braces and must be semicolon
//		};l1.drive();
		
//		Lambda l1= speed-> { // for single parameters and data type lambda will automatically take and if we have only one parameter we no need to give(speed) that is braces we can remove
//			System.out.println("drive");
//			sSystem.out.println("dsboj");
//		};
//		l1.drive(100);
	

//		 Lambda l1= (id,name) -> {
//			 System.out.printl("jdsofu");// multiple parameters and here also data type noo need
//			 
//		 };
//		 l1.student(23,"jsdfhis");
//}


Lambda l1=() -> 100;// return type
System.out.println(l1.getSpeed());
		
		
	}
	
}














