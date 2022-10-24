package lesson.three;

import java.util.HashSet;

public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> cars = new HashSet<String>();
		System.out.println(cars);
		cars.add("Toyota");
		cars.add("Honda");
		cars.add("Toyota");
		cars.add("honda");
		// [Toyota, honda, Honda]
		for(String car :cars ) {
			System.out.println(car.toUpperCase());
		}
		
	}

}
