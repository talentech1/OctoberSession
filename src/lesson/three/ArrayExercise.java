package lesson.three;

public class ArrayExercise {

	public static void main(String[] args) {
		double[] itemsPrices = {30.54, 8.89, 3.25, 132.0, 22.9};	
		// Find the total value of the above array;
		double total = 0.0;
		
		for(int i=0; i<itemsPrices.length; i++) {
			total = total + itemsPrices[i];
		}
		System.out.println(total);

	}

}
