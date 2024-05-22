package arrays.java;

import com.reddy.accessmodifiers.Student;

public class ImportingModifiers {
	public static void main(String[] args) {// outside the packages
		Student s=new Student();
		s.printrollNumber();
		System.out.println(s.rollNo);
	}
	
}
