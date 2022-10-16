package lesson.three;

public class NestedLoops {

	public static void main(String[] args) {
		int counter =0;
		for(int i=1; i<=10; i++) {
			for(int j=1; j<=10; j++) {
				for(int k=1; k<=10; k++) {
					System.out.println("I: "+ i + " J: " +j + " k: " + k);
					counter++;
				}
				System.out.println("JJJJJJJJJJJJJJJJJJJJJJJJJ");
			}
			System.out.println("IIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
		}
		
		System.out.println(counter);

	}

}
