package com.reddy.CollectionsFrame;

//import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

//import com.sun.swing.internal.plaf.metal.resources.metal;

public class ProgramPractiseNavigableMap {

	public static void main(String[] args) {
		NavigableMap<Integer, String> n=new TreeMap<Integer, String>();

			
					
				n.put(103, "elen");
				n.put(1036, "elenen");
				n.put(106, "enz");
				n.put(102, "fgger");
				n.put(102, "len");
				//n.put(null, null);
				n.put(107, null);
		
		//System.out.println(n.descendingMap());
		
		//System.out.println(n.headMap(106));      //Returns key-value pairs whose keys are less than the specified key.  

		//System.out.println(n.tailMap(106));//      //Returns key-value pairs whose keys are greater than or equal to the specified key.  

		//System.out.println(n.subMap(103, 1036));//      //Returns key-value pairs exists in between the specified key.  

		
		//System.out.println(n);
				
				
				
				
			//Navigable map extends sorted map	
		// new methods in Navigable map as it doesn't available in sorted map
//		n.ceilingKey(null);
//		n.higherKey(null);
//		n.higherEntry(null);
//		n.lowerKey(null);
	System.out.println(n.lowerEntry(102));
//		n.floorKey(null);
		System.out.println(n.floorKey(1036));
		
				//System.out.println(n);
			
		
		
	}

}	
		

	


