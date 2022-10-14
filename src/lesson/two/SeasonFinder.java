package lesson.two;

public class SeasonFinder {

	public static void main(String[] args) {
		int month = 13;
		int date = 20;
		

		if ((month == 3 && date >= 20) || month == 4 || month == 5 || (month == 6 && date < 21)) {
			System.out.println("Spring");
		} else if (month == 6 || month == 7 || month == 8 || (month == 9 && date < 22)) {
			System.out.println("Summer");
		} else if (month == 9 || month == 10 || month == 11 || (month == 12 && date < 21)) {
			System.out.println("Fall");
		} else if (month == 12 || month == 1 || month == 2 || month == 3) {
			System.out.println("Winter");
		}

	}

}
