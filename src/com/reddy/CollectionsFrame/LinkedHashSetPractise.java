package com.reddy.CollectionsFrame;
import java.util.*;


public class LinkedHashSetPractise {//insertion order

	public static void main(String[] args) {
		
//		Linked Hashset>>linked hashmap  -data storing>>link of nodes(key, value)
		
		//Set<Integer> s=new LinkedHashSet<Integer>();
		
		LinkedHashSet<Integer> lhs=new LinkedHashSet<Integer>();
		
		// Dummy value to associate with an Object in the backing Map while adding
//	    private static final Object PRESENT = new Object();
		
		   lhs.add(56);
		   System.out.println(lhs.hashCode());                   //adding int values
		   lhs.add(67);
		   System.out.println(lhs.hashCode());
		   lhs.add(34);
		   System.out.println(lhs.hashCode());
		   lhs.add(89);
		   lhs.add(36);
		   lhs.add(12);
		   lhs.add(12);//duplicate not allowed

		   lhs.add(364);
		   System.out.println(lhs.remove(1));
		   System.out.println(lhs.remove(2));//  we are giving data not index
		   
		   System.out.println(lhs.contains(12));//verifying
//	   to update data we have to remove the data and add newly
		   
//			  for retieval we can use iterator and for each loop
			  for (Integer integer : lhs) {
				System.out.println(integer);
			}
			  
		
		System.out.println(lhs.size());
		
		
		System.out.println(lhs);// output is in insertion order
		
		
		System.out.println(lhs.add(null));
		System.out.println(lhs);
		
		
		
		
	}

}
