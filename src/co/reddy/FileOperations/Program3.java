package co.reddy.FileOperations;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) throws IOException {
    File file =new File("./Input.txt");
    
    	Scanner sc=new Scanner(file);
       sc.hasNextLine();
       while(sc.hasNextLine()) {
    	   System.out.println(sc.nextLine());
    		
    	}
    		sc.close();
	}

}
