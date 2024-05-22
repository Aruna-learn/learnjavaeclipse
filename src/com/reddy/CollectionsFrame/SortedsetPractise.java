package com.reddy.CollectionsFrame;


import java.util.SortedSet;
import java.util.TreeSet;

public class SortedsetPractise {

	public static void main(String[] args) {
		SortedSet<Integer> ss= new  TreeSet<Integer>();
		
//		Does not offer methods to retrieve and remove elements based on their position within the set.
//		Does not support navigation in reverse order directly through its interface.
		
//		ss.comparator();
//		ss.first();
//		ss.headSet(null);
//		ss.last();
//		ss.spliterator();
//		ss.subSet(null, null);
//		ss.tailSet(null);
//		

		ss.add(89);
		   ss.add(36);
		   ss.add(12);
		//   ss.add(null);//not allow null pointer exception
		   
		System.out.println(ss.headSet(36));//lessthan elements
		
		
		System.out.println(ss);
		
		
		
		

	}

}
