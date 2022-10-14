package lesson.two;

public class LoopContinue {

	public static void main(String[] args) {
		for(int i = 0; i <=100; i++ ) {
			if(i >=20 && i <30)  {
				continue;
			}
			System.out.println(i);
		}

	}

}
