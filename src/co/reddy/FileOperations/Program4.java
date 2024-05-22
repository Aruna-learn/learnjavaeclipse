package co.reddy.FileOperations;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Program4 {

	public static void main(String[] args) throws IOException {
    File file =new File("./Input.txt");
    
    	FileReader fr=new FileReader(file);
    	System.out.println(fr.read());
    	fr.close();
	}
}
