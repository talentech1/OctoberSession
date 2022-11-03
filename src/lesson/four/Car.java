package lesson.four;

public class Car {
	public String brand;
	public int maxSpeed;
	public String color;
	public static double price;

	public Car(String carBrand, String carColor, int maxSpeed) {
		brand = carBrand;
		color = carColor;
		this.maxSpeed = maxSpeed;
	}
	
	public void printInfo() {
		String s = "Its a " + color + " " + brand + " with max speed of " + maxSpeed;
		System.out.println(s);
	}

	public String toString() {
		String s = "Its a " + color + " " + brand + " with max speed of " + maxSpeed;
		return s;

	}
	
	public static void printPrice() {
		System.out.println(price);
	}
}
