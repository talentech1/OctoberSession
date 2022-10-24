package lesson.four;

public class Car {
	String brand;
	int maxSpeed;
	String color;

	public Car(String carBrand, String carColor, int maxSpeed) {
		brand = carBrand;
		color = carColor;
		this.maxSpeed = maxSpeed;
	}

	public String toString() {
		String s = "Its a " + color + " " + brand + " with max speed of " + maxSpeed;
		return s;

	}
}
