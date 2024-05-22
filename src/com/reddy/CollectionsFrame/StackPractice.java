package com.reddy.CollectionsFrame;

import java.util.Stack;

public class StackPractice {

	public static void main(String[] args) {
		Stack <String> books=new Stack<>();//String means Iam specifying the values iam storing is string, we can use interger for numbers, for boolean for tru ro false
		
		books.push("Aruna");
		books.push( "reddy");
		books.push("Mona");
		books.push("Mona");
		books.push(null);
//		books.set(0, "Lion");
//		System.out.println(books.get(2));
//		
		
		
//		System.out.println(books.peek());// shows last added element
//		System.out.println(books);
		
		
//		System.out.println(books.pop());// shows last added and remove the element
//        System.out.println(books);
//        
        

//System.out.println(books.push("maths"));//added the elemets to stack
//System.out.println(books);

		
		
//System.out.println(books.search("reddy"));
//System.out.println(books.search("Mona"));//search starts from last added element to first, bottom count 1 to increases
//System.out.println(books.indexOf("reddy"));//top index 0 to increases
//System.out.println(books);
		
		
		System.out.println(books.isEmpty());//vector
		System.out.println(books.empty());//stack
		System.out.println(books);
	}

}
