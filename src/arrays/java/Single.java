package arrays.java;

public class Single {

	public static void main(String[] args) {
		/*int i[]=new int[5];//creating object with new keyword
		i[0]=45;
		i[2]=56;
		i[3]=47;
		i[4]=35;
		i[4]=87;
		for(int j=0;j<i.length;j++) { to get all array values use for loop
		System.out.println(i[j]);
			
		}
	System.out.println(i[4]); for single value output
	System.out.println(i[3]);
	}*/

int i[]= new int[]{23,78,56,90,90}; //  internally java create object
 int sum=0;


	for (int j=0; j<i.length;j++) {
		sum=sum+i[j];
	}
	System.out.println(sum);
		//System.out.println(i.length);
//System.out.println(i[j]);
}
}