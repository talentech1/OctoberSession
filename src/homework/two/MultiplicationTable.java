package homework.two;

public class MultiplicationTable {

	public static void main(String[] args) {

		for (int number = 1; number <= 10; number++) {
			for (int i = 1; i <= 20; i++) {
				int result = number * i;
				System.out.println(number + " X " + i + " = " + result);
			}
			System.out.println("------------------------");
		}

	}

}
