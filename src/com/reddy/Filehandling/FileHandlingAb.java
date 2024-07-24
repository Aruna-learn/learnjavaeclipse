package com.reddy.Filehandling;

import java.io.File;
import java.io.IOException;

public class FileHandlingAb {

	public static void main(String[] args) throws IOException {
		File f=new File("D:\\test file\\mynew.txt");//Absolute path full path
		
		//System.out.println(f.createNewFile());//create the file
		
		//System.out.println(f.delete());// delete the file
		
		//System.out.println(f.exists());//check whether file exists or not instead of writing 3 statement we can write in single statement for create delete and checking
		
		/*
		 * if(f.exists()) f.delete(); System.out.println(f.createNewFile());
		 */
			
	
    //System.out.println(f.isHidden());
System.out.println(f.canWrite());
//f.setWritable(true);
System.out.println(f.lastModified()
		);
System.out.println(f.getName());
	}

}
