package com.reddy.accessmodifiers;

public class Student {  // same class
     public  int rollNo=123;

     public Student() {
	rollNo=234;
}

     public void  printrollNumber() {
	System.out.println(rollNo);
}

private void abc() {// we can access method in same class
	printrollNumber();
}
}


//Access Modifier	within class	within package	outside package by subclass only	outside package

//            wc  wp  ops op
//Private	  Y	  N	  N	  N
//Default	  Y	  Y	  N	  N
//Protected	  Y	  Y	  Y	  N
//Public	  Y	  Y	  Y	  Y