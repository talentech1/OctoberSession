package lesson.three;

import java.util.ArrayList;

public class MethodReturns {

	public static void main(String[] args) {
		int[] abc = { 1, 2, 45, 78, 32, 17, 39 };
		ArrayList<Integer> a = onlyEven(abc);
		System.out.println(a);
		a.remove(0);
		System.out.println(a);
	}

	public static boolean isOdd(int number) {
		if (number % 2 != 0) {
			return true;
		} else {
			return false;
		}
	}

	public static ArrayList onlyEven(int[] arr) {
		ArrayList<Integer> evenNumnbers = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (isOdd(arr[i])) {
				// to nothing
			} else {
				evenNumnbers.add(arr[i]);
			}
		}
		return evenNumnbers;
	}

}
