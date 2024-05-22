package reddy.oops.inheritance;

public class Developer extends Guest {

	public void write() {
	super.read();// access the guest class i.e super class object using super keyword
		write();
		System.out.println("Developer write");
	
}
	public void read() {
		System.out.println("reddy");//it prints if we access read() method in this class
	}
}
