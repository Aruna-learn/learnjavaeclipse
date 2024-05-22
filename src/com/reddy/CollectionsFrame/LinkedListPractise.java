package com.reddy.CollectionsFrame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class LinkedListPractise {

	public static void main(String[] args) {
		//types we can create instance for linkedlist because linked list implemets list and dequeue so dequeue extends queue and all are correct only
//		List<String> ll=new LinkedList<String>();
//		LinkedList<String> ll=new LinkedList<String>();
//		Queue<String>ll=new LinkedList<String>();
//		Deque<String> ll=new LinkedList<String>();
//		Collection<String> ll=new LinkedList<String>();
//		Iterable<String> ll=new LinkedList<String>();	
		
		
		//perform same operations as arraylist and vector
		
		ArrayList<String> al=new ArrayList<String>();// to add linkedlist
		al.add("Mohana");
		al.add("s2");
		
		LinkedList<String> ll=new LinkedList<String>();
		
		ll.add("aruna");
		ll.add("yt");
		ll.add("yr");
		ll.add("yg");
		ll.addAll(al);// adding array to linked list
	//	ll.remove(1);
		//ll.clear();
		
		ll.add(null);
		ll.add("aruna");
//ll.set(1, "rani");
		

//for (String s : ll) {
//	System.out.println(s);
	System.out.println(ll.contains("reddy"));
}

//		ll.set(2, null);
//		System.out.println(ll.get(2));
		
		
		
//System.out.println(ll);
////		System.out.println(al);
//Collections.synchronizedList(ll);// to achieve synchronized
	}


