package lesson.three;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MethodsExample {

	public static void main(String[] args) {
		int[] numbers = { 2, 3, 45 };
		printArrayTotal(numbers);
		int[] numbersTwo = {24,25,1,2};
		printArrayTotal(numbersTwo);
	}

	public static void printDate() {
		DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss");
		Date date = new Date();
		System.out.println(dateFormat.format(date));
	}

	public static void printHelloXTimes(int times) {
		for (int i = 1; i <= times; i++) {
			System.out.println("Hello!!");
		}
	}

	public static void calc(double a, double b, String operation) {
		if (operation.equals("+")) {
			System.out.println(a + b);
		} else if (operation.equals("-")) {
			System.out.println(a - b);
		} else if (operation.equals("*")) {
			System.out.println(a * b);
		} else if (operation.equals("/")) {
			System.out.println(a / b);
		}
	}

	public static void printArrayTotal(int[] arr) {
		int total = 0;
		for (int i = 0; i < arr.length; i++) {
			total += arr[i];
		}
		System.out.println(total);
	}

}
