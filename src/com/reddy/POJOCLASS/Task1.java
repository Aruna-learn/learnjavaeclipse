package com.reddy.POJOCLASS;



public class Task1 {
	private static Object[] arr;

	public static void main(String[] args) {
		Student s=new Student();
		s.setID(18);
		s.name="job";
		s.salary=5678899;
		
		Student s1=new Student();
		s1.setID(180);
		s1.name="jobsdf";
		s1.salary=56788999;
		
		Student s2=new Student();
		s2.setID(90);
		s2.name="reddy";
		s2.salary=1000000;
		
		Student[] student=new Student[] {s,s1,s2};// we are storing and getting the s s1 s2 data in array called pojo class		
		
		
		
		  int sum=0;
		  
		  
		  for (int j=0; j<student.length;j++)
		  { 
			  sum+=student.length;
			  }
		  System.out.println(sum);
		 
		 
		
		
		
		
		
		/*
		 * System.out.println(s.getId()+ "s.name"+ "s.salary" );
		 * System.out.println(s1.getId()+ "s1.name"+ "s1.salary" );
		 * System.out.println(s2.getId()+ "s2.name"+ "s2.salary" );
		 */
//		System.out.println(s.getId());
//		System.out.println(s.name);
//		System.out.println(s.salary);
		//System.out.println(arr[s1]);
	}

	private static char[] arr(int salary) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	

}
