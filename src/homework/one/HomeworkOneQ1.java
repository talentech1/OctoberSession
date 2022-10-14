package homework.one;

public class HomeworkOneQ1 {

	public static void main(String[] args) {
		int max =100;
		int min = 1;
		int numberOne = (int) (Math.random() * (max - min + 1) + min); 
		int numberTwo = (int) (Math.random() * (max - min + 1) + min); 
		
		if(numberOne > numberTwo) {
			System.out.println(numberOne + " is Bigger than "+ numberTwo);
		}else {
			System.out.println(numberTwo + " is Bigger than " + numberOne);
		}

	}

}
