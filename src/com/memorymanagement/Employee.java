package com.memorymanagement;

public class Employee {
	int orgId=2345;//instance variables, orgId-naming convension in variable should be small
    String orgName="Poololla";//string literals
    String ceo="Anjineyulu Reddy";
    int noOfDepts=2;
    static double netWorth=790066.65;//static variables
	
	public static void main(String[] args) throws InterruptedException {
       
		int eid=103;//local variables
		String empName="Aruna";
		double salary=60000;
		
	Employee e=new Employee();//e is reference variable and objects information
	e.getorgId();
	System.out.println(e.getorgId());
	//e.getnetWorth();
	
	Employee e1=new Employee();
	
	e.getnetWorth();
System.out.println(e.getnetWorth());

//Thread.sleep(5000);
		
	}
	
	
	public int getorgId() {
	return orgId;
	}
	
	public static double getnetWorth() {
		return netWorth;
	}

	
	
	
}
