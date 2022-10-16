package lesson.three;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		// Syntax to create an object is
		// new NameofClass();
		Scanner input = new Scanner(System.in);
		System.out.println("How manay times should I say Hello?");
		int count = input.nextInt();
		for(int i =-3; i<=count; i++) {
			System.out.println("Hello!!");
		}
		
	}

}
