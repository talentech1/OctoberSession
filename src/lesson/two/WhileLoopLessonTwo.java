package lesson.two;

public class WhileLoopLessonTwo {

	public static void main(String[] args) {
		// Print all the leap year
		int startYear = 1800;
		int endYear = 2022;

		while (startYear <= endYear) {
			System.out.println(startYear);
			startYear = startYear + 4;
		}

	}

}
