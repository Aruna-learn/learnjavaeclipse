package com.innerclass;


//non static or nested class
public class  InnerClassesEx {

	public static void main(String[] args) {
      System.out.println("Arunareddy innerclass: InnerClassesEx");
	}
	
	protected class Aruna{//inner class//can we create public, private, protected inner classes: yes
		
	}

	 private class Poori{//inner class// nested class
		
	}
	
	public class Madhavi1{
		
	}
 private  abstract class Chinni{// can we create a static/abstarct/ final inner classes:yes
		
	}
public static class Chinni1{
	
}
	
protected final class roopa{
	
}
}




//class Aruna {// can we have more than one class in java file yes/non static nsted class
//
//
//}

//public class Innerclass{// can we have more than one public class in java file:no
//
//}

/* how many class files will be generated when multiple classes are present in a java file
* class test{ for each class one class file will generate and we can check in
* folder structure
* 
* }
* 
* class test2{// subclass in main class
* 
* } class test6{}
*/



//  can we have main method in all class files present at the roof level of java
//  file:yes and it compliles we cn get class files and while executing java asks
//  which class file should execute 
//  class reddy{
//	  public static void main(String[] args) 
//	  { 
//		  System.out.println("Arunareddy innerclass: InnerClassesEx1"); 
//		  }
//	  }
  
//  class kutti{
//	  public static void main(String[] args) {
//  System.out.println("Arunareddy innerclass: InnerClassesEx2"); 
//	  }
//  }
  
	  
 
 














