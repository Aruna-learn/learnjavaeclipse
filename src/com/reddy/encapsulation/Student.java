package com.reddy.encapsulation;

public class Student {
 private int rollNumber;
 private  String name;
 private  boolean isAttended;

public Student(int rollNumer) {
	this.rollNumber= rollNumber;// we re this if we are calling the class level variable if the same name is there
}

public void setStudentAttendance( boolean flag) {
	isAttended=true;
	System.out.println("attended student");
}

public  boolean getStudentAttendance() {
	
	return isAttended ;
	
}
// if we want  multiple properties  getter and setter for our data we can right click -source-generate getter and setter methods and select the methods

public int getRollNumber() {
	 
	return rollNumber;
}

public void setRollNumber(int rollNumber) {
	//System.out.println(134);
	this.rollNumber = rollNumber;
}

public String getName() {
	return name;
}

public void setName(String name) {
	//System.out.println("rgbjorw");
	this.name = name;
}


}
