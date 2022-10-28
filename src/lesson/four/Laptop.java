package lesson.four;

public class Laptop {
	String brand;
	String color;
	double price;
	private int screenSize;
	int weight;
	private int batteryPercentage = 100;
	private boolean isON = false;

	private long onTime;

	public Laptop(String brand, String color, double price, int screenSize, int weight) {
		this.brand = brand;
		this.color = color;
		this.price = price;
		this.weight = weight;
		this.screenSize = screenSize;
	}

	public void turnOn() {
		this.isON = true;
		this.onTime = System.currentTimeMillis();
	}

	public void turnOff() {
		this.batteryPercentage = calculateCurrentBatteryLevel();
		this.isON = false;
		this.onTime = 0;
	}

	public String toString() {
		return brand + ", " + color + ", " + price + ", " + screenSize + ", " + weight + ", ";
	}

	public int calculateCurrentBatteryLevel() {
		if (isON) {
			long onDurationInMS = System.currentTimeMillis() - this.onTime;
			batteryPercentage = (int) (batteryPercentage - (onDurationInMS / 100));
			if (batteryPercentage <= 0) {
				batteryPercentage = 0;
				isON = false;
			}
			return batteryPercentage;
		} else {
			return batteryPercentage;
		}
	}

	public void printStatus() {
		int currentPercentage = calculateCurrentBatteryLevel();
		if (isON) {
			System.out.println("The laptop is on with battery " + currentPercentage);
		} else {
			System.out.println("The laptop is off with battery " + currentPercentage);
		}

	}

}
