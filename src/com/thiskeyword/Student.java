package com.thiskeyword;

public class Student {

	  int age=23;
	
	  public Student(){
		  System.out.println(this.age);// use this keyworkd in constructor
	  }
	public static void main(String[] args) {
		Student s= new Student();
		s.setAge(103);
		System.out.println(s.getAge());
		
		Student s1= new Student();
		s1.setAge(13);
		System.out.println(s1.getAge());
		
		Student s2= new Student();
		s2.setAge(10);
		System.out.println(s2.getAge());
		

	}
	public int getAge() {
		
		return age;
		
	}

	public void setAge(int age) {
		this.age=age;
	}
	
	{
		System.out.println(this.age);//  this keyword in non static block
	}
}

