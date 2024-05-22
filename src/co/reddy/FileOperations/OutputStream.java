package co.reddy.FileOperations;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class OutputStream {

	public static void main(String[] args) throws IOException {
		File file =new File("./Input.txt");
	    if(file.exists())
	    	file.delete();
	    	System.out.println(file.createNewFile());
	    	
	    	String s="reddyarunadfjoehfeieoiew";
	    	
	    	FileWriter fw=new FileWriter(file);
	    	fw.write(s);//fw.write(s.tochararray());
	    	
	    	fw.flush();

	    	fw.close();
	    	}

}
