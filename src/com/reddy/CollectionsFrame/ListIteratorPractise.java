package com.reddy.CollectionsFrame;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorPractise {

	public static void main(String[] args) {
		
		//ListIterator is a interface 
		// Introduced for iterating only the list type collection objects(array list, linked list, stck, vector)
	
		// legacy classess1.0+ new classes 1.2 (Arraylist,vector, stacketc)
// Bi direction iteration - read and write
		
		ArrayList<Integer> al=new ArrayList<>();
		al.add(11);
		al.add(110);
		al.add(56);
		al.add(34);
		al.add(10);
		ListIterator<Integer> li=al.listIterator();

		while(li.hasNext()) {// forward direction
			System.out.println(li.next());
		}
		li.add(20000);// added to list
		System.out.println();
		
		while(li.hasPrevious()) {//backward direction
			System.out.println(li.previous());
		}
		li.remove();
		System.out.println(al);
		
	}

}
