package mypack;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("What is your name");
		String name =scanner.nextLine();
		System.out.println("what is your age:");
		int age =scanner.nextInt();
		System.out.println("What is your salaary" + scanner.hasNext());
		//boolean salary=scanner.hasNextByte();
		double salary=scanner.nextDouble();
		scanner.close();
		
	}


}
