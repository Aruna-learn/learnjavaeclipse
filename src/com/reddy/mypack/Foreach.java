package com.reddy.mypack;
//used for arrays and collections [for(data_type variable : array_name)]
public class Foreach {

	public static void main(String[] args) {
		
		/*
		 * int arr[] = { 1, 2, 5, 8, 9, 3, 5 }; for( int i=0;i<arr.length;i++) {
		 * System.out.println(arr[i]); }
		 * 
		 * 
		 * int sum=0; for(int i:arr) { sum+=i; } System.out.println(sum/arr.length); for
		 * (int i : arr) {
		 * 
		 * }
		 */
			int sum=0;
			int arr[][]= {
					{1,2,3},
					{2,6,9},
					{5,7,0}
			};
					for ( int i=0;i<arr.length;i++) {
						for (int j=0;j<arr[i].length;j++) {
						sum+=i;
						  System.out.print(sum);
						  }
					System.out.println();
			}
		}
}

	


