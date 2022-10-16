package lesson.three;

import java.util.ArrayList;
import java.util.Scanner;

public class BetterBetterAddCalc {

	public static void main(String[] args) {
		ArrayList<Double> nums = new ArrayList<Double>();
		Scanner userInput = new Scanner(System.in);
		while(true) {
			System.out.println("Please enter a number");
			double a = userInput.nextDouble();
			nums.add(a);
		}
		
	}

}
