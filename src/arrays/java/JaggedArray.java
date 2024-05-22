package arrays.java;

public class JaggedArray {

	public static void main(String[] args) {
		int arr[][]=new int [2][];//columns will be empty
		arr[0]= new  int[2];//2 columns in 0row
		arr[1]=  new int[6];// 6columns in 1row
		arr[0][0]=2; 
		arr[0][1]=3;
		  
		  arr[1][0]=9;
		  arr[1][1]=92;
		  arr[1][2]=9;
		  arr[1][3]=78;
		  arr[1][4]=64;
		  for( int i=0;i<arr.length;i++) {
				for( int j=0;j<arr[i].length;j++) {
					System.out.print(arr[i][j]+ " ");
	}
	  System.out.println();

}
	}
}
