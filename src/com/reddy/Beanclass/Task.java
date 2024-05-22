package com.reddy.Beanclass;

public class Task {

	public static void main(String[] args) {
		Employee e=new Employee();
		e.setId(67);
		e.setName("Aruna");
		e.setSalary(378900877);
		
		System.out.println(e.getId()+ " " +e.getName()+ " "+ e.getSalary());

	}

}
