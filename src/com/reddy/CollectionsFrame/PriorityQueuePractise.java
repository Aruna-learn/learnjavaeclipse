package com.reddy.CollectionsFrame;

import java.util.*;// unbounded queues
import java.util.concurrent.*;//bounded queues

public class PriorityQueuePractise {//single sided deletion queue

	public static void main(String[] args) {
		
		//ways for creation of queue
		//Queue<Integer> pq=new  PriorityQueue<>();//priority queue implements queue and we can use like this also
		
		PriorityQueue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder());//Comparator.reverseOrder()
 //gives values in reverse order
		
		//add-  offer,add
		//retrieval- peek
		//remove- poll,remove
		
		
		
		pq.offer(12);
		pq.offer(56);
		pq.add(34);
		pq.offer(87);
		
		pq.offer(23);
		pq.offer(10);
		pq.offer(40);
		
		
		//[10, 12, 23, 40, 56, 34, 87]- here 10 is lowest interger and highest priority means hpoints to head and then elements are not in sorted order [10, 12, 23, 40, 56, 34, 87] 

		
		
		
	//System.out.println(pq.peek());//for retieval peek gives only head element that is lowest integer
		
	//System.out.println(pq.poll());  // 10
	//[12, 23, 34, 87, 56, 40] - removes 10 as head value and returns remaining values
	
	//System.out.println(pq.poll());//12
	//[23, 40, 34, 87, 56]  
		
		
		while(!pq.isEmpty()) {//gives values on priority that is ascending order
			System.out.println(pq.poll());
		}
		//System.out.println(pq.comparator());
		
		System.out.println(pq.contains(23));//verfies
		//pq.clear();
		


	}

}
