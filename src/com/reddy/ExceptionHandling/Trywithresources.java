package com.reddy.ExceptionHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Trywithresources {

	public static void main(String[] args) throws Throwable {
		
		File file =new File("./Input.txt");
	    //auto closeable instead of using the br.close  we can directly use with try catch block for autocloseable
		int a=9;
		int b=0;
		int c;
		
	  try (FileReader fr=new FileReader(file);//try with resource
	    
			  BufferedReader br=new BufferedReader(fr))
			  {
				  String line=new String();
				  c=a/b;
				    
				    while((line= br.readLine()) != null) {
				    	System.out.println(line);
				    	}
			  }
				    catch(ArithmeticException ae) {
				    	
				    	 throw new ArithmeticException("never");// changing exception msg /by zero to never
				    	
				    	//throw new LoginException("login not working");// create new class as login exceptiona and object creation and super message
				    	
				    //System.exit(0);//stops here didn't execute finally block
				    }
	  catch(FileNotFoundException e1) {
		  e1.printStackTrace();
		  System.out.println("Filenotfound reddy");
		  
	  }catch(ArrayIndexOutOfBoundsException cl) {//multiple catch blocks
		  cl.printStackTrace();
		  System.out.println("classnot found");
	  }
	  
	  finally {
		  System.out.println("aruna reddy");
		
	}
	  
	}
}		  
	    
			  
			  
	


