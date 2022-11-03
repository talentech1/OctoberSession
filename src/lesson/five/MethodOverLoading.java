package lesson.five;

import java.util.Scanner;

public class MethodOverLoading {

	public static void main(String[] args) {
		Scanner userInput =  new Scanner(System.in);
		int a = userInput.nextInt();
		int b = userInput.nextInt();
		System.out.println(add(a, b));
	}
	
	public static int add(int a, int b) {
		System.out.println("Adding 2 integers");
		return a+ b;
	}
	
	public static int add(int a, double b) {
		System.out.println("Adding 1 integer and 1 double");
		return (int) (a+b);
	}
	
	public static int add(double a, int b) {
		System.out.println("Adding 1 double and 1 integer ");
		return (int) (a+b);
	}
	
	public static int add(int a, int b, int c) {
		System.out.println("Adding 3 integers");
		return a+b+c;
	}

}
