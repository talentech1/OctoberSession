package lesson.three;

import java.util.HashSet;

public class FindUniqueNumbers {

	public static void main(String[] args) {
		int[] mixedNumbers = { 12, 10, 9, 2, 45, 2, 10, 10, 45 };
		int[] arr = {1, 2, 3, 4, 5};
	    int[] arr2 = {1, 1, 1, 1, 1};
	    printUniq(mixedNumbers);
	    printUniq(arr);
	    printUniq(arr2);

	}
	
	public static void printUniq(int[] arr) {
		HashSet<Integer> numbers = new HashSet<Integer>();
		
		for(int i=0; i<arr.length; i++) {
			numbers.add(arr[i]);
		}
		
		System.out.println(numbers);
	}

}
