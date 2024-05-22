package com.reddy.Filehandling;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;

public class FileHandlingRe {

	public static void main(String[] args) throws IOException {
//		File f=new File("./mynew.txt");//create relative file or path// no need for full path that ts root directory only
//		if(f.exists())
//			f.delete();
//		System.out.println(f.createNewFile());
		
		//File f=new File("./Coding/java/");//relative folder
		//System.out.println(f.mkdirs());//mkdir for one folder creations and mkdirs for many folders creation
//		if(f.exists())
//			System.out.println(f.delete());
//		
		File f=new File("C:\\Software\\Aruna_JAVA\\Learn");
		System.out.println(Arrays.toString(f.list()));//shows the list of files in path
		
		System.out.println(Arrays.toString(f.listFiles()));//shows entire path
//		System.out.println(f.getName());//returns file name only
//		System.out.println(f.getAbsolutePath());
//		System.out.println(f.getParent());
//		
//		File f1=new File(f.getParent()+ "/resume000.docx/");// we can craete new file from previous folder
//		System.out.println(f1.createNewFile());
		System.out.println(f.isFile());
		System.out.println(f.isDirectory());
		System.out.println(new Date(f.lastModified()));
		System.out.println(f.getTotalSpace());
		
	}

}
