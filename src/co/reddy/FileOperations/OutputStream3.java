package co.reddy.FileOperations;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class OutputStream3 {

	public static void main(String[] args) throws IOException {
		File file =new File("./Input.txt");
//	    if(file.exists())
//	    	file.delete();
//	    	System.out.println(file.createNewFile());
	    	
	    	
	    	String ExistingText=new String();
	    	String line="";
	    	
	    	BufferedReader br=new BufferedReader(new FileReader(file));//reading data
	    	while((line=br.readLine()) !=null)//printing data
	    		ExistingText+=line+"\n";
	    	
	    	String s="isuwqyetweyvowerpe";//adding extra data
	    	
	    	BufferedWriter bw=new BufferedWriter(new FileWriter(file));//writeting the data with new created file
	    	bw.write(ExistingText +s);//printing old and new added datda
	    	
	    	bw.flush();
	    		bw.close();
	    	}

}
