package lesson.three;

import java.util.ArrayList;
import java.util.Scanner;

public class BetterAddCalc {

	public static void main(String[] args) {
		ArrayList<Double> nums = new ArrayList<Double>();
		
		Scanner userInput = new Scanner(System.in);
		System.out.println("How many numbers do you want to add");
		int count = userInput.nextInt();
		double total = 0;
		for(int i =0; i<count; i++) {
			System.out.println("Please enter a number");
			double userNumber = userInput.nextDouble();
			nums.add(userNumber);
			total = total + userNumber;
		}
		
		System.out.println(nums);
		System.out.println(total);

	}

}
