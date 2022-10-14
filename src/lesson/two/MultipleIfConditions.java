package lesson.two;

public class MultipleIfConditions {

	public static void main(String[] args) {
		// 92> A, 80>B, 70> c, 60> d, else F
		int grade = 50;
		if (grade > 92) {
			System.out.println("Your grade is A");
		} else if (grade > 80) {
			System.out.println("Your grade is B");
		} else if (grade > 70) {
			System.out.println("Your grade is C");
		} else if (grade > 60) {
			System.out.println("Your grade is D");
		} else {
			System.out.println("Your grade is F");
		}
	}

}
