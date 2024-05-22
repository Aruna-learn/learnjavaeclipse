package com.reddy.CollectionsFrame;

import java.util.ArrayDeque;

public class ArrayDequePractise {// double sided insertion and deletion queue

	public static void main(String[] args) {
		ArrayDeque<String> ad=new ArrayDeque<String>();
		//extended methods as compared to priority queue
		//add-  offer,  offerfirst, offerlast, addfirst, add last, add all
				//retrieval- peek, peakfirst, peaklast
				//remove- poll,pollfirst, polllast
		//removefirst remove last
		
		
		//add-  offer,  offerfirst, offerlast, addfirst, add last, add all
		//[abjoeef, igiube, reddy, kutti, jbisuf, sfiveuff]
		ad.offer("reddy");
		ad.add("kutti");
		ad.offerFirst("igiube");
		ad.offerLast("jbisuf");
		ad.addFirst("abjoeef");
		ad.addLast("sfiveuff");
		//ad.offer(null);
		ad.add("sfiveuff");
		ad.add("kutti1");
		ad.add("kutti2");
		ad.add("kutti3");
		ad.add("kutti4");

		
		
		
		//retrieval- peek, peakfirst, peaklast
		
		System.out.println(ad.peek());//abjoeef
//		System.out.println(ad.peekFirst());//abjoeef
//		System.out.println(ad.peekLast());//sfiveuff
//		System.out.println();
		
		
		//remove- poll,pollfirst, polllast
//		System.out.println(ad.poll());//abjoeef
//		System.out.println(ad.pollFirst());//igiube
//		System.out.println(ad.pollLast());//sfiveuff
//		System.out.println();
		
		
		//removefirst remove last
//		System.out.println(ad.remove());//reddy
//		System.out.println(ad.removeFirst());//kutti
//		System.out.println(ad.removeLast());//jbisuf
//		
//		System.out.println(ad.size());
		//System.out.println(ad.clear());
		
		
		
		System.out.println(ad);//[]
		
		
		
		
		
		
		
		
		
	}

}
