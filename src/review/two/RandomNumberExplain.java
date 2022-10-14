package review.two;

public class RandomNumberExplain {

	public static void main(String[] args) {
		int max = 75;
		int min = 5;
		int randomNumber = (int) (Math.random() * (max - min + 1) + min);
		System.out.println(randomNumber);

	}

}
