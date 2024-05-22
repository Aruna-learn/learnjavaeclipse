package reddy.oops.inheritance;

import com.reddy.accessmodifiers.Student;

public class Subclass extends Student {

	public static void main(String[] args) {
		new Subclass().sub();// created instance for subclass and call sub method
		//outside the package by subclass
		
		
		
		
	}
	public void sub() {
		System.out.println(rollNo);
		printrollNumber();
	}

}
