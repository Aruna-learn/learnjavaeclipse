package com.reddy.CollectionsFrame;

import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetPractise {

	public static void main(String[] args) {
		NavigableSet<Integer> ns= new TreeSet<Integer>();
		
//		Allows for retrieving and removing elements from both ends of the set with methods like pollFirst() and pollLast().
//		Supports descending iterators and sets, allowing for reverse order navigation through descendingIterator() and descendingSet()
		
		ns.add(89);
		   ns.add(36);
		   ns.add(12);
		//   ns.add(null);null pointer exception
		   ns.add(12);//no duplicates
		 System.out.println(ns.descendingSet());//descending order
		
		
//		ns.ceiling(null);
//		ns.descendingIterator();//descending order
//		ns.descendingSet();
//		ns.floor(null);
//		ns.headSet(null);
//		ns.headSet(null, false);
//		ns.higher(null);
//		ns.iterator();
//		ns.lower(null);
//		ns.pollFirst();//retrieval
//		ns.pollLast();
//		ns.subSet(null, null);
//		ns.subSet(null, false, null, false);
//		ns.higher(null);
//		ns.tailSet(null, false);
		
		System.out.println(ns);
		
		
		
		
		
		

	}

}
