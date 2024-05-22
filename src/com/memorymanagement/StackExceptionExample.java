package com.memorymanagement;

public class StackExceptionExample {

	public static void main(String[] args) {
		
		
    new StackExceptionExample().add(1);//creating object and call add method
    
    
    
	}
	
	public void add(int i) {
		System.out.println(i);
		i++;
		if(i<10000)//9999- we can specify the recursion 
		
		add(i);// call add method
		//20365 executes
		//20514
		
		//Xss2m-2MB stack memory increases
		//41934
		//Xss10m-10MB stack memory increases
		//217148
		//Runconfirguration -arguments-vmarguments--Xss10000m-run

	}

}
