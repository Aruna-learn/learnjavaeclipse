package com.reddy.CollectionsFrame;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class Array {

	public static void main(String[] args) {
		//ArrayList<String> al=new ArrayList<String>();// we can this also (empty arraylist)
		//Integer[] arr=new Integer[] {1,5,9,0,34,89,45};
	//ArrayList<Integer> al=new ArrayList<Integer>(Arrays.asList(arr));//array creation(collection of data)
	ArrayList<Integer> al=new ArrayList<Integer>(34);// passing size and create
	al.add(null);//add
	al.add(345);
	al.add(null);
	al.add(34);
	al.add(null);
	al.add(1,0);
	al.add(3);
	al.add(null);
	al.add(35);
//	System.out.println(al.get(4));//retrival
//	
//System.out.println(al.remove(1));//remove
//
//System.out.println(al.contains(34));//verification
//
//
//al.set(2, 90);
//System.out.println(al.get(2));


		//System.out.println(al);
		
		for (Integer integer : al) {
			System.out.println(al);
			Collections.synchronizedList(al);// improves synchronization
		}
		
	}

}
