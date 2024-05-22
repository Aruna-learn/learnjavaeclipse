package co.reddy.FileOperations;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Program5 {

	public static void main(String[] args) throws IOException {
    File file =new File("./Input.txt");
    
    FileReader fr=new FileReader(file);
    
    BufferedReader br=new BufferedReader(fr);
    
   String line=new String();
    
    while((line= br.readLine()) != null) {
    	System.out.println(line);
    }
    
    br.close();
    
    
	}
}
