package com.reddy.CollectionsFrame;

import java.util.LinkedList;

public class LinkedListqueue {

	public static void main(String[] args) {
		
        LinkedList<String> llq=new LinkedList<>();
        llq.offer("reddy");
		llq.add("kutti");
		llq.offerFirst("igiube");
	llq.offerLast("jbisuf");
		llq.addFirst("abjoeef");
		llq.addLast("sfiveuff");
		llq.offer(null);//allows null values
		llq.add("sfiveuff");
		llq.add("kutti1");
		llq.add("kutti2");
		llq.add("kutti3");
		llq.add("kutti4");
        
		
//retrieval- peek, peakfirst, peaklast
		
		System.out.println(llq.peek());//abjoeef
		System.out.println(llq.peekFirst());//abjoeef
	System.out.println(llq.peekLast());//sfiveuff
		System.out.println();
        
        
		//remove- poll,pollfirst, polllast
		System.out.println(llq.poll());//abjoeef
		System.out.println(llq.pollFirst());//igiube
		System.out.println(llq.pollLast());//sfiveuff
		System.out.println();
		
		
		//remove first remove last
		System.out.println(llq.remove());//reddy
	System.out.println(llq.removeFirst());//kutti
	System.out.println(llq.removeLast());//jbisuf
//		
//		System.out.println(ad.size());
		//System.out.println(ad.clear());
		
        System.out.println(llq);





	}

}
