package com.reddy.CollectionsFrame;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class SetPractiseHashSet {

	public static void main(String[] args) {
		
//		Hashset>>HasMap(not hash table public HashSet() {
        //map = new HashMap<>();
    //} )>>Array of nodes(key,value)//hash map storing mechanism
		
//		Set<Integer> s=new HashSet<Integer>();
		
//		new Object()=dummy object(we are using key values only here for values it reates dummy object)
//				
//				private static final Object PRESENT = new Object()
		
		// Dummy value to associate with an Object in the backing Map while adding
//	    private static final Object PRESENT = new Object();
		
		   HashSet<Integer> hs=new HashSet<Integer>();
		   hs.add(56);
		   System.out.println(hs.hashCode());                   //adding int values
		   hs.add(67);
		   System.out.println(hs.hashCode());
		   hs.add(34);
		   System.out.println(hs.hashCode());
		   hs.add(90);                   
		   System.out.println(hs.hashCode());
		   hs.add(12);
		   System.out.println(hs.hashCode());
		   hs.add(2);
		   System.out.println(hs.hashCode());
		   hs.add(2);// doen't add duplicate values
		   System.out.println();
		   
		   System.out.println(hs.add(null));
//		   System.out.println(hs.remove(1));
//		   System.out.println(hs.remove(2));//  we are giving data not index
		   
//		   System.out.println(hs.contains(12));verifying
//		   to update data we have to remove the data and add newly
		   
		   
//		  for retieval we can use iterator and for each loop
		  for (Integer integer : hs) {
			System.out.println(integer);
		}
		  
		  
		  
		  
		  
		  
		  
		  
		   System.out.println(hs);// output is not in insertion order
		   
		   
		   
		
		
		
	}

}
