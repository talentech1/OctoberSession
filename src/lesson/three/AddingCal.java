package lesson.three;

import java.util.Scanner;

public class AddingCal {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[] numbers = new double[3];
		// [0][0]0][0][0]
		double total = 0.0;
		for(int i=0; i<numbers.length; i++) {
			System.out.println("please enter a number to add");
			numbers[i] = input.nextDouble();
			total = total + numbers[i];
			System.out.println("Total is: " + total);
		}
	}

}
