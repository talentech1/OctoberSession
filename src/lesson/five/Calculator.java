package lesson.five;

public class Calculator {
	public static int add(int a, int b) {
		System.out.println("Adding 2 integers");
		return a + b;
	}

	public static int add(int a, double b) {
		System.out.println("Adding 1 integer and 1 double");
		return (int) (a + b);
	}

	public static int add(double a, int b) {
		System.out.println("Adding 1 double and 1 integer ");
		return (int) (a + b);
	}

	public static int add(int a, int b, int c) {
		System.out.println("Adding 3 integers");
		return a + b;
	}
	
	public static double devide(int a, int b) {
		return a/b;
	}
}
