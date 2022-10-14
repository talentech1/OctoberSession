package homework.one;

public class QuestionTwo {

	public static void main(String[] args) {
		int max =100;
		int min = 1;
		int randomNumber = (int) (Math.random() * (max - min + 1) + min);
		
		if(randomNumber % 7 == 0) {
			System.out.println(randomNumber + " is devideable by 7");
		}else {
			System.out.println(randomNumber + " is NOT devideable by 7");
		}

	}

}
