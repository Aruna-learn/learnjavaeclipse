package mypack;

public class Constructors {
	int id;
	String name;

	Constructors(int i, String n){
		id=i;
		name=n;
	}

	public static void main(String[] args) {
		
//Constructors cp=new Constructors(); default constructor
		
		Constructors cp=new Constructors(11,"Aruna");
cp.display();

	}

	void display() {
		System.out.println(id +" "+name);
	}
	}


