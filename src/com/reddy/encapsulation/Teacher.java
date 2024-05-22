package com.reddy.encapsulation;

public class Teacher {
	public static void main(String[] args) {
		Student s=new Student(105);
//		s.isAttended=true;// if no one dont access we can use the privae data modifiers
//		System.out.println("attended");if we use like this more time will take for extra statements so over come this we are using the getter setter methods
		s.setStudentAttendance(true);
		
		s.setRollNumber(139);
		
		s.setName("fvkjb");
		
		System.out.println(s.getStudentAttendance()+" "+s.getRollNumber()+" "+ s.getName());
	}

}
