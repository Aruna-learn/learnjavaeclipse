package com.reddy.strings;

public class ImmutableStr {

	public static void main(String[] args) {

	//Mutable strings when data changes address not changes
	StringBuffer sb1=new StringBuffer("aruna");//24
	StringBuffer sb2=new StringBuffer("aruna");//36
//	sb1.insert(0, "Mona");
//	sb1.delete(0, 5);
//	sb1.charAt(2);
//	sb1.capacity();
//	sb1.ensureCapacity(100);
//	sb1.reverse();
	System.out.println(sb1.equals(sb2));// check address
	System.out.println(sb1==sb2);//check data but false because objects has address and its different
	
	
	System.out.println(sb1);
	
	
	
	
	
//	System.out.println(sb1==sb2);//false because different objects
//
//	sb1=sb1.append("reddy");//24
//	System.out.println(sb1==sb2);
//	
//	StringBuffer sb3=new StringBuffer("arunareddy");//44
//	System.out.println(sb1==sb3);
//	

	//Mutable strings when data changes address not changes
//	StringBuilder sbl1=new StringBuilder("aruna");//24
	
//	StringBuilder sbl2=new StringBuilder("aruna");//36
//	System.out.println(sbl1==sbl2);//false because different objects
//
//	sbl1=sbl1.append("reddy");//24
//	System.out.println(sbl1==sbl2);
//	
//	StringBuilder sbl3=new StringBuilder("arunareddy");//44
//	System.out.println(sbl1==sbl3);	
		
		
		
		
		
		
		
		
		//Immutable strings because when the data changes address also changes to overcome this we use stringbuffer and builder
		
//String s1="aruna";//47
//
//String s2="aruna";//47
//
//System.out.println(s1==s2);
//
//s1=s1+"reddy";//51
//System.out.println(s1==s2);
//
//String s3="arunareddy";//53
//System.out.println(s1==s3);



//System.out.println(s1==s3);//== check the address
//System.out.println(s1==s2);//string are immutable because we are changing data and address also changing but if mutable if data changes address will not change


	}

}
