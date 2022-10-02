package com.tt.lesson.one;

public class OddEven {

	public static void main(String[] args) {
		int max = 100;
		int min = 1;
		int randomNumber = (int) (Math.random() * (max - min + 1) + min);

		if (randomNumber % 2 == 0) {
			System.out.println(randomNumber + " is even");
		} else {
			System.out.println(randomNumber + " is odd");
		}

	}

}
