package com.typecastingtypeconversion;

public class Enum {

	public enum season{WINTER, SPRING, SUMMER};
	public static void main(String[] args) {
		//Season s=Season.WINTER;
		//value-array, valueof-constant, ordinal-index
for (season s : season.values()) {
	System.out.println(s);
	
	
}
	}

}


//If you put main() method inside the enum, you can run the enum directly.

//enum Season {   
//WINTER, SPRING, SUMMER, FALL;  
//public static void main(String[] args) {  
//Season s=Season.WINTER;  
//System.out.println(s);  
//}  
//} 


//Defined outside class
//enum Season { WINTER, SPRING, SUMMER, FALL }  
//class EnumExample2{  
//public static void main(String[] args) {  
//Season s=Season.WINTER;  
//System.out.println(s);  
//}}   


//Defined inside class
//class EnumExample3{  
//enum Season { WINTER, SPRING, SUMMER, FALL; }//semicolon(;) is optional here  
//public static void main(String[] args) {  
//Season s=Season.WINTER;//enum type is required to access WINTER  
//System.out.println(s);  
//}}  