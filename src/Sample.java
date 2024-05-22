
public class Sample {
	int id;
	String name;
	//creating a parameterized constructor 
	Sample(int i, String n){
	 id=i;
	 name=n;
	}
	//method to display the values 
	void display() {System.out.println(id+"" +name);}
	

	public static void main(String[] args) {
		//creating objects and passing values  
		Sample s1=new Sample(111,"aruna");
		Sample s2=new Sample(145,"arunareg");
		//calling method to display the values of object  
				s1.display();
				s2.display();
				

		// TODO Auto-generated method stub

	}

}

//Java Program to create and call a default constructor  
class Bike1{  
//creating a default constructor  
Bike1(){System.out.println("Bike is created");}  
//main method  
public static void main(String args[]){  
//calling a default constructor  
// Bike1 b=new Bike1(); 
}  
}  
