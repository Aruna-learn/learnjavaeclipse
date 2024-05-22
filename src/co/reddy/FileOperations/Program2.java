package co.reddy.FileOperations;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Program2 {

	public static void main(String[] args) throws IOException {
    File file =new File("./Input.txt");
    if(!file.exists())
    	System.out.println(file.createNewFile());
    
    FileInputStream fis=new FileInputStream(file);
    int asciiCode;
    while((asciiCode=fis.read())!=-1) {
    	System.out.print((char)asciiCode);
    	System.out.println(fis.getFD());
    	
    }
    fis.close();
    
	}

}
