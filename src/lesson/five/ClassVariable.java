package lesson.five;

import lesson.four.Car;

public class ClassVariable {

	public static void main(String[] args) {
		Car redCar = new Car("Honda", "Red", 150);
		System.out.println(redCar.color);
		
		Car bluesCar = new Car("Honda", "Blue", 120);
		System.out.println(bluesCar.color);
		System.out.println(Car.price);
		Car.price = 100;
		System.out.println(redCar.price);
		System.out.println(bluesCar.price);
		redCar.price = 500;
		
		System.out.println(redCar.price);
		System.out.println(bluesCar.price);
		
		Car greenCar = new Car("Lexus", "Green", 130);
		System.out.println(greenCar.price);
		System.out.println(Car.price);
		greenCar.printInfo();
		redCar.printInfo();
		Car.printPrice();
		
		String a = redCar.toString();
		System.out.println(a);
		System.out.println(a.length());
	}
	

}
