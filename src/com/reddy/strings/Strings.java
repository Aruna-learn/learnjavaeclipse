package com.reddy.strings;



public class Strings {

	public static void main(String[] args) {
		/*
		 * String s1="Aruna"; String name="reddy"; String
		 * emailid="arunaammu9922@gmail.com"; System.out.println(s1);
		 * System.out.println(name); String s2=new String("Helloo");
		 * 
		 * System.out.println(emailid); System.out.println(s1 + name);//concatenation
		 * System.out.println(s2);
		 */
String s1="aruna";
String s2="Reddy";
String s3="ARUNA";
String s4=new String("Mona");
String s5=new String("Mona");
String s6=new String ("Aruna reddy mona monazi ");

System.out.println(s3.intern());






    System.out.println(s1==s3);//== check the address
	System.out.println(s4==s5);
	System.out.println(s1==s6);

	System.out.println(s1.equals(s3));//check the data with equals 
	System.out.println(s1.equals(s6));
	System.out.println(s1.equalsIgnoreCase(s3));// doesn't check whether it is upper or lower case
	System.out.println(s1.contains("r"));
	System.out.println(s1.startsWith("ar"));
	System.out.println(s1.endsWith("na"));

//	System.out.println(s6.length());// it will consider middle spaces also
//	System.out.println(s6.trim());//removes leading and trailing spaces i.e., starting and ending only not in middle
//	System.out.println(s6.trim().length());
//	System.out.println(s1.toUpperCase());
//	System.out.println(s3.toLowerCase());
//	char[] a=s1.toCharArray();// we can see in dubug as [a,r,u,n,a]

//	System.out.println(s1.indexOf("n"));
//	System.out.println(s1.indexOf("z"));//-1 because if char is not present in the given string it will show the -1 as default
//	System.out.println(s1.lastIndexOf("a"));// if duplicate char in the given string then we can use the last index of for the wanted  second duplicate char index then it will show the last index
//	System.out.println(s6.substring(1));//starts with 1 index
//	System.out.println(s6.substring(3));//start with 3index

	System.out.println(s6.substring(1,4));//starts with 1 and ends with 4 index[starting index starts with 0 and ending index starts with 1]
//	
/*
 * System.out.println(s6.split(" "));// prints array
 * [Ljava.lang.String;@76ed5528
 * System.out.println(Arrays.toString(s6.split(" "))); we can split by using for
 * each loop String[] words=s1.split("\\s");//splits the string based on
 * whitespace //using java foreach loop to print elements of string array
 * for(String w:words){ System.out.println(w); }}
 */


/*
 * System.out.println(s6.charAt(60));//car 7th index prints
 * System.out.println(s4.replace("M", "z"));
 * System.out.println(s6.replace("reddy", "kuyy"));
 * System.out.println(s4.replaceAll("a", "h"));
 */
 

/*
 * String replaceString=s1.replaceAll("a","e");
 * //replaces all occurrences of "a"
 * to "e" System.out.println(replaceString); ] we can use the string object creation and get the output
 */


/*
 * value of- we can convert string to boolean, char, int, float, double int i=40;
 * System.out.println(String.valueOf(i)); String s7 = String.valueOf(i);
 */
	String s8="    aruna ";
	String s9="";
	System.out.println(s8.isBlank());//remove blank space the verify
	System.out.println(s9.isEmpty());//number of characters contained in a string is zero.
	System.out.println(s4.compareTo(s5));
	
	/*public class ConcatExample2 {  
	    public static void main(String[] args) {      
	        String str1 = "Hello";  
	        String str2 = "Javatpoint";  
	        String str3 = "Reader";  
	        // Concatenating one string   
	        String str4 = str1.concat(str2);          
	        System.out.println(str4);  
	        // Concatenating multiple strings  
	        String str5 = str1.concat(str2).concat(str3);  
	        System.out.println(str5);  */
	    }  
	
		/*
		 * public class StringJoinExample2 { public static void main(String[] args) {
		 * String date = String.join("/","25","06","2018"); System.out.print(date);
		 * String time = String.join(":", "12","10","10"); System.out.println(" "+time);
		 * } }
		 */
	
	
	
	
	}


