package com.reddy.CollectionsFrame;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class IteratorPractise {

	public static void main(String[] args) {
		//Iterator is a interface 
				// Introduced for iterating all the  collection objects
				//since 1.0 old version of java v@1.0 classess are legacy classes
				// legacy classess1.0+ new classes(Arraylist, linked hashmap etc)1.2
		// one direction iteration -  read only, allow special permission to remove elements in existing
				
		ArrayList<Integer> al=new ArrayList<>();
		al.add(11);
		al.add(110);
		al.add(56);
		al.add(34);
		al.add(10);
		
//		Iterator method is used for accessing iterator
		
		//al.iterator();
		
	
		
		Iterator<Integer> i =al.iterator();
//		i.hasNext();//it tells whether next element is there or not
//		i.next();//gives element
//		i.remove();
		while(i.hasNext()) {
			//System.out.println(i.next());
			/*
			 * i.next(); i.remove();//after next menthod only we have to use remove
			 * otherwise throws error [110, 56, 34, 10] [56, 34, 10] [34, 10] [10] []
			 */
			System.out.println(al);
			
			
			// For Hashmap we can use directly iterator because it is not collection it is map so in orer do this we can get separate keyset and values
			HashMap<String, Integer> Hm=new HashMap<>();
			Hm.put("India", 90);
			Hm.put("dfjids", 900);
			Hm.put("grgsr", 9000);
			Hm.put("sdds", 9);
			Hm.put("bdfg", 91);
			
		// For Hashmap we can use directly iterator because it is not collection it is map so in orer do this we can get separate keyset and values

			Hm.keySet().iterator();
			Hm.values().iterator();
			Hm.entrySet().iterator();
			
			
			
		}
		

		
		
		
		
		
		
	}

}
