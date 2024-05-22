package com.reddy.CollectionsFrame;

import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetPractise {//sorted order in ascending order

	public static void main(String[] args) {
		
//		Set<Integer> s=new TreeSet<Integer>();
		
		
//		Linked Hashset>>linked hashmap  -data storing>>link of nodes(key, value)
		
		
//        NavigableSet<Integer> nv=new TreeSet<Integer>();
//		Set<Integer> s=new TreeSet<Integer>();
		
		TreeSet<Integer> ts=new TreeSet<Integer>();
		
		   ts.add(89);
		   ts.add(36);
		   ts.add(12);
		   ts.add(364);
		   ts.add(85);
		   ts.add(32);
		   ts.add(10000);
		   ts.add(10000);//duplicate not allowed

		   ts.add(36409955);
		//   System.out.println(ts.add(null));not allow null values
		   System.out.println(ts.remove(1));
		   System.out.println(ts.remove(2));//  we are giving data not index
		   
		   System.out.println(ts.contains(12));//verifying
//	   to update data we have to remove the data and add newly
		   
//			  for retieval we can use iterator and for each loop
			  for (Integer integer : ts) {
				System.out.println(integer);
			}
			  
		
		System.out.println(ts.size());
		
		
//		Additional methods for Treeset compated to other set
		System.out.println(ts.last());//prints last element
		System.out.println(ts.first());//prints first element
	//	System.out.println(ts.lower(null));
		System.out.println(ts.pollFirst());//remove 1st element
		System.out.println(ts.pollLast());//remove last elment
		
		System.out.println(ts.subSet(5, 40));//prints the range of values between 5 and 40 creates virtual set only, affects on main set also
		
		 System.out.println(ts.descendingSet());  
		   
		   
		   
		   
		   
		   
		   
		System.out.println(ts);
		
		
		
		
		
		
		
		
	}

}
