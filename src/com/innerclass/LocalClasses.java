package com.innerclass;

public class LocalClasses {

	private int id=90;//instance variable
	
	public static void main(String[] args) {
		int salary=8900098;//local variable
		
		
		
//		A a=new A() {//anonymous object 
//			public void test() {
//				System.out.println("update class A");
//		}
//			
//		
//		};
//		a.test();
//		a.test1();
//		
//		}
//	
//		
//}
		
		/*
		//AbstrLocal //ab=new AbstrLocal(){// Anonymous with abstract class
			public void show() {
				
				System.out.println("sgboisd");
			}
		};
		ab.show();
		
	}
}
		*/
		
		LocalInn ln=new LocalInn() {// anonymous with interface

			@Override
			public void test() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mona() {
				System.out.println("sdfbjsfueuog");
				
			}

			@Override
			public void reddy() {
				System.out.println("bods");
				
			}
			
		};
		ln.mona();
		ln.test();
		ln.reddy();
	
		
		
	}
	
}
		
		
		
	/*class A {
		public void test() {
			System.out.println("class A");
		}
		public void test1() {
			System.out.println("class test1");
		}
	
	}
		*/
//		class classB extends A {//class A method i dont like like to use so we are using another class class only for one method execution so instead of this we can create anonymous object and use it and no need of extra class and extends also
//			public void test() {
//				System.out.println("update class A");
//			}
//		}
	
	
	
	
	
		/*
		class classB extends AbstrLocal{
			public void show() {
				//System.out.println("sgboisd");
				
			}
		}
			@Override
			public void print() {
				System.out.println("reddkjsdf");
				
			}
		}
	*/
		

		
		
		
		
		
     /*System.out.println("local classes");
     
    final class A{    //local class
    	
    	public   void print() {
    		System.out.println("salary" +salary);
    	}
	
  }
    
    A a=new A();//object creation to call method
    a.print();

	}
	public void show() {
		
	}*/
	
	
	
//	public LocalClasses() { constructor and object for local class
//		final class A{
//			
//		  }
//
//	}
	
	
//	{
//		final class A{// local class block non static block
//			
//		}
//	}
	
	
	
	
//	static {
//		final class A{ // static local class block
//			
//		}
//	}


