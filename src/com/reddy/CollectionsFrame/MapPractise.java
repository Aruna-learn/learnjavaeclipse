package com.reddy.CollectionsFrame;
import java.util.*;
import java.util.Collection;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapPractise {

	private static Integer[] keys;

	public static void main(String[] args) {
		//creation of map
		//Map m=new Hashtable();
		Map<Integer, String> m=new TreeMap<>();//Treemap, Hashtable, hashmap all are same 
		System.out.println(m.hashCode());
		//Addition of elements to map
		m.put(103, "elen");
		System.out.println(m.hashCode());
		m.put(1036, "elenen");
		System.out.println(m.hashCode());
		m.put(106, "enz");
		m.put(102, "fgger");
		m.put(102, "len");
		//m.put(null, null);
		m.put(107, null);
		System.out.println(m.hashCode());
		System.out.println(m);
		
		//retireval of keys froo map--key set
//		Set<Integer> keys =m.keySet();
//		for (Integer key : keys) {
//			System.out.println(key);
//	}
//		System.out.println();
//			
			//retrieval of values form map
//		Collection<String>values =m.values();
//		for (String value : values) {
//			System.out.println(value);
//		}
//		System.out.println();
		
		//Retireval of value from the map based on key
		//System.out.println(m.get(102));
		
		
		//to get all the values based on key
		
//		for (Integer key : keys) {
//			System.out.println(key + ">>>>>"+m.get(keys));
//		}
		
		//System.out.println(m);
		
		    //deletion of element from map
//		m.remove(103);
//		System.out.println(m);
//		
		   //verify value and keys present in map
//		System.out.println(m.containsKey(102));
//		System.out.println(m.containsKey(502));

//		System.out.println(m.containsValue("len"));
//		System.out.println(m.containsValue("lenggrre"));
//		
		          //update values
//		System.out.println(m);
//		m.put(106, "enzfgdsgsesfefefef");//106 is updated(override) with enzfgdsgsesfefefef
//		System.out.println(m);
		
//		m.putIfAbsent(106,  "enzfgdsgsesfefefef");//putifabsent doen't overide
//		System.out.println(m);
		
		//m.replace(null, null);// we can use replace also data updation
		System.out.println(m.size());
		//m.clear();
		
	//m.entrySet() iterate like for loop to get keys and values- entry set
		
		Set<Entry<Integer, String>> entries=m.entrySet();
		for (Entry<Integer, String> entry : entries) {
			Integer key=entry.getKey();
			String value=entry.getValue();
			System.out.println(key+">>>" +value);
			
			System.out.println();
		}
		
		
		
		
		
		}
		
		
	}


