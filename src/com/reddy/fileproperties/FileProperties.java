package com.reddy.fileproperties;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

public class FileProperties {

	public static void main(String[] args) throws IOException {
		File f= new File("dbConfig.properties");
		if(!f.exists())
			System.out.println(f.createNewFile());//file creation
		//f.delete();//file deletion
				//System.out.println(f.exists());
		
		Properties prop=new Properties();//property class and object creation
		prop.setProperty("url", "https://javatpoint.com");
		FileInputStream fis=new FileInputStream(f);
		prop.load(fis);//loading again if we change or update any value
		prop.setProperty("url", "https://javat.com");

		
		prop.setProperty("password", "Ammu@460");

		prop.setProperty("username", "arunaammu9922@gmail.com");

		prop.setProperty("time", "india zone");
		//FileOutputStream fos= new FileOutputStream(f);//write

		//prop.store(fos, "Properties file ");
		
//		Read
//		FileInputStream fis=new FileInputStream(f);
//		prop.load(fis);
		
		
//		1.keys and keyset return
		//Set<String> keys =prop.stringPropertyNames();//keys return
	//	Set<Object> keys=prop.keySet();keyset return
		//System.out.println(keys);
		
		
//		2.values retun
//		Collection<Object> c=prop.values();// collection of object returns values keyset
//		System.out.println(c);
		
		System.out.println(prop.getProperty("url"));
		System.out.println(prop.getProperty("time"));
		System.out.println(prop.getProperty("age","34"));// default value if key is not there
		
		System.out.println(prop);
		for (Object key :prop.keySet() ) {
			System.out.println(key+ ">>>>>"+ prop.getProperty((String)(key)));//(String)(key) type casting from object to string
			
			
			
		//3.to retun values
			Set<Entry<Object,Object>> data=prop.entrySet();
			System.out.println(data);
			
//			to remove
			System.out.println(prop.remove("url"));
			System.out.println(prop.remove("time"));
			
			
			
		}
		
		
		
		
		
		
		
		
	}

}
