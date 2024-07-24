package co.reddy.FileOperations;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class ReaddatafromTesxtfileusingFileandScanner  {

	public static void main(String[] args) throws IOException {

		//Read the dtaa from text file using scanner and file reader
		File file =new File("./Input.txt");

		Scanner sc=new Scanner(file);
		sc.hasNextLine();
		while(sc.hasNextLine()) {//has nextline give true or false if any line with text or not
			System.out.println(sc.nextLine());//read the data using nextline method

		}
		sc.close();
	}

}
