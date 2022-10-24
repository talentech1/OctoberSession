package homework.two;

public class UniqueNumbers {

	public static void main(String[] args) {
		// unique = true;
		int[] mixedNumbers = { 12, 10, 9, 2, 45, 2, 10, 10, 45 };
		printUniqueNumbers(mixedNumbers);
		int[] arr = {1, 2, 3, 4, 5};
	    int[] arr2 = {1, 1, 1, 1, 1};
	    printUniqueNumbers(arr);
	    printUniqueNumbers(arr2);
	}

	public static void printUniqueNumbers(int[] arr) {
		/* assume every number is unique 
		 * 1. take the first number 2. compare aganist the other numbers 3. Go to the
		 * next number 4. compare aganinst the rest
		 */
		for (int j = 0; j < arr.length; j++) {
			int testNumber = arr[j];
			boolean unique = true;
			for (int i = 0; i < arr.length; i++) {
				if (j == i) {
					continue;
				}
				if (testNumber == arr[i]) {
					unique = false;
					break;
				}
			}
			if (unique) {
				System.out.print(testNumber + ",");
			}

		}
		System.out.println();

	}

}
