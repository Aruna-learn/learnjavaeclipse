package com.reddy.CollectionsFrame;

import java.util.ArrayDeque;
import java.util.Dictionary;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Properties;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;

public class EnumerationPractise {

	public static void main(String[] args) {
		//Enumeration is a interface used for legacy classs
		// Introduced for iterating the legacy collection objects
		//since 1.0 old version of java v@1.0 classess are legacy classes
		//Hashtable, stack, vector, Dictionary, properties= since@1.0
//		new classes are at v1.2- treeset, hasmap, linkedhasmap etc
		//Read only one forward direction
		Vector<String> v= new Vector<>();
		v.add("aruna");
		v.add("aruna1");
		v.add("aruna2");
		v.add("aruna3");
		v.add("aruna4");
		v.add("aruna5");

//		elements method used for accessing enumeration
		
		//Enumeration<String> e=v.elements();// e holds the object of elements type//read only and forwrd iteration
		
		
//		2methods in enumeration thats is access elements andverify next elemets
		//e.hasMoreElements();
		//e.nextElement()
		
//		while(e.hasMoreElements()) {
//			System.out.println(e.nextElement());
//		}
		
		
		
//		Properties prop=new Properties();// gives values only not keys 
//       prop.setProperty("url", "https://javat.com");
//
//		
//		prop.setProperty("password", "Ammu@460");
//
//		prop.setProperty("username", "arunaammu9922@gmail.com");
//
//		prop.setProperty("time", "india zone");
//		Enumeration<Object> e=prop.elements();
//		
//		prop.elements().asIterator();// wecan do the  from enumeration also we can get iteration
//		
//		while(e.hasMoreElements()) {
//			System.out.println(e.nextElement());
//		}
//		
		
		Hashtable<String, Integer> ht=new Hashtable<>();
		ht.put("India", 90);
		ht.put("dfjids", 900);
		ht.put("grgsr", 9000);
		ht.put("sdds", 9);
		ht.put("bdfg", 91);
		Enumeration<Integer> e=ht.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
			
			
			
		}
		
		
		
		
		
		
	}

}
