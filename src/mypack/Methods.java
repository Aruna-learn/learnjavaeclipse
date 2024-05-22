package mypack;

public class Methods {
	int currentBalance=80;
	
/**
 * @author hp
 * @Version 
 * @param amount
 */
public void deposit( int amount) {
	currentBalance=currentBalance + amount;
			System.out.println("Amount deposited");
}
	
	public  static void main(String[] args) {
  
   Methods methods=new Methods();
   methods.deposit(500);
   System.err.println("Amount received");
  
	}

}



//methods 2types
//predefined-equals(), compareTo();max(),min(),sqrt(), main, print(java.io.printstream and prtinstream class)
//use defined methods-add subetc


// (non static method) public void deposit(){

