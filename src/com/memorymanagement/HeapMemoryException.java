package com.memorymanagement;

public class HeapMemoryException {

	public static void main(String[] args) {
		
		int size=10;
for(int i=0; i<Integer.MAX_VALUE; i++) {
	int[] arr= new int[size];
	size*=2; 
	System.out.println(size);//671088640
	//1342177280  // -Xmx10000m-10000MB-heap memory increase
	//Runconfirguration -arguments-vmarguments--Xmx10000m-run

	
}
	}

}
