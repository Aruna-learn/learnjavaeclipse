package mypack;
//Datatype
// byte, short, int, long, float, double- datatype  primitive
//Byte, Short, Integer, Long, Float, Double- wrapper class by using this we can size of the datatype
//eg System.out.println(Byte.MIN_VALUE);
//Non primitive are arrays, classes, collcetions, interface
public class Datatypevariable {
	static double i;

	public static void main(String[] args) {

		System.out.println(i);


	}
}
//Variables
//Datatype variable name=variable value
/**public class Variable {
	public static void main (String args[]) {
		int pincode;//define
		pincode=600100;//initialization
		int pincode=70067;//define and initiatization
		System.out.println(pincode);


	}

}*/

//contructor and class name should be same name and class name object also same

/**)instance or non static)public class Student {
	int id=179;
	String name=arua;//non static variables because no static keyword used
	public static void main(String[] args) {
		Student student=new Student();
		
		System.out.println(student.id);//instance created
		
		System.out.println(new Student().name); //instance created to get name
	}

}*/

//static variables
/**public class Student{
 static int id =134;
 public static void main(String[] args) {
	 System.out.println(id);

}
 public static void test2(){
	 System.out.println(id);

 }
}*/


//local variable
/**public class Student{
	public static void main(String[] args) {
		int height=45;//local variable inside the meethod body
		System.out.println(height);


	}
	public  static void test4() {
		System.out.println(height);
	}
}*/


/** Variables are case sensitive 
 * for small name we can use lowercase other wise use camel case
 * shortcut can't use
 * for constants we can use the uppercase and _ and $ symbols in between ot last but not in the first
 */