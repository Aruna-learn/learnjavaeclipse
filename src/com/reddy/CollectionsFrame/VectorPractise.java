package com.reddy.CollectionsFrame;

import java.util.Vector;
import java.util.*;

public class VectorPractise {

	
	
	//Vector
	
	public static void main(String[] args) {
		//size: no of elements in list
		// capacity= array capacity by default 10 if we want we can add
		
		
		//Array to list
				Object[] arr=new Object[] {1,5,7,9};
				Vector<Integer> v=new Vector<>();//generics// Integer meand storing int value and string means storing the string values
				//v.add("aruna");
				v.add(78);
				v.add(null);
				System.out.println(v);
		
		
		
		/*
		 * Vector v=new Vector();//Vector v=new Vector[20];// capacity is 20
		 * v.add("Aruna");//2nd index // right shifting v.add("Aruna reddy");//3rd index
		 * v.add("reddyAruna"); //0index v.add("pooree");//1st index
		 */
		
		
      
     Vector v1=new Vector();
     
	   v1.add("b");
     v1.add("u");
      v1.add("poe");
    v1.add("p");
    v1.add("kuyyi");
	/* for lopp takes more time so that we can use add all method in java
	 * for (int i=0;i<v1.size();i++) { v.add(v1.get(i));
	 * 
	 * }
	 */
    
   // System.out.println(v);// before adding
//    v.addAll(v1);
//    v.addAll(0,v1);// add from 0index
    
      // System.out.println(v);// after adding
//       System.out.println(v.size());//size no of elements in the list
//       System.out.println(v.capacity());// Array capacity
       
       
      // System.out.println(v.get(7));// retrieval of data
    
//    v1.remove("p");
//    System.out.println(v1);
//    
//    v1.remove(2);
//    
//    System.out.println(v1);
//    
//    v1.removeAll(v);
//    System.out.println(v);
//    
//    v1.clear();
//    System.out.println(v1);// deleted entire list and cleared
//    
//    System.out.println(v.contains("Aruna"));// verification
//    System.out.println(v.containsAll(v1));

//    v.set(2, "Madhu");
//    System.out.println(v.get(2));   //updating
//    
//    System.out.println(v.lastIndexOf("Aruna reddy"));
    
//   System.out.println(v.lastElement());
//   System.out.println(v.firstElement());
//   
//   Object[] arr=v.toArray();
//   System.out.println(Arrays.toString(arr));
	       
	       
   
       
}
}