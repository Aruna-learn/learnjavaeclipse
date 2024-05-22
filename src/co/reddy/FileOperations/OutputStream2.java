package co.reddy.FileOperations;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStream2 {

	public static void main(String[] args) throws IOException {
//		File file =new File("./Input.txt");
//	    if(file.exists())
//	    	file.delete();
//	    	System.out.println(file.createNewFile());
//	    	
//	    	String s="reddyaruna";
//	    	
//	    	FileOutputStream fos=new FileOutputStream(file);
//	    	for (char ch: s.toCharArray()) {
//	    		fos.write(ch);
//	    	}
//	    			
//	    	//System.out.println(fos.write(75));
	    	File file=new File("./Practise.text");
	    	if(file.exists())
		    	file.delete();
		    	System.out.println(file.createNewFile());
	    	
//	    	fos.write(78);
//fos.write(34);
//	    	fos.write(29);
//	    	fos.flush();
	    	//fos.close();
	}

}
