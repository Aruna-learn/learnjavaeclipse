package com.innerclass;

public class InnerClassPractise {
 private int id=90;
	public static void main(String[] args) {
		System.out.println("Inner class practise");
		InnerClassPractise icp=new InnerClassPractise();//outer class object
		// Reddy r=new InnerClassPractise().new Reddy();
		//Reddy r=icp.new Reddy();//inner class object created on outer class
		
		
		Mona m=new InnerClassPractise. Mona();//static inner class object creation
		
		
		
		
//		r.add();
//		//r.show();
//		System.out.println(r.id);
//		System.out.println();
//		System.out.print(r.hike());

	}
	public class Reddy  implements Student{//inner class extends non abstract class and implements also
		private int id=60;
		public void show() {// we can't write the code directly in class so we are using the method to get the data
			int id=80;
			System.out.println(id);
			System.out.println(this.id);
			System.out.println(InnerClassPractise.this.id);//accessing outer class variable
		//	System.out.println(getHappy());
			hike();
		}
		
		public void add() {
			Reddy r=new Reddy();// objected created n another method of inner class
		}

		public boolean hike() {
			System.out.println("happy hike");
			return false;
			
		}

		@Override
		public void salary() {
			System.out.println("yees");
			
		}

		@Override
		public void timesheet() {
			System.out.println("dfvbdu");
			
		}
		
		public class kutty extends Reddy{// inner class extends another inner class:yes
			public void avc() {
				show();
			}
		}

		@Override
		public void hoke() {
			// TODO Auto-generated method stub
			
		}
		
	}
	public static class Mona{//static class
		public void abc() {
			System.out.println("abc");
		}
	}

}
