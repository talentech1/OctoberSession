package lesson.four;

public class ObjectsTwo {

	public static void main(String[] args) throws InterruptedException {
		Laptop lp1 = new Laptop("Dell", "Blue", 700.00, 14, 4);
		System.out.println(lp1);
		Laptop lp2 = new Laptop("HP", "Black", 600, 15, 5);
		System.out.println(lp2);
		lp2.price = 650;
		System.out.println(lp2);
		
		lp2.turnOn();
		Thread.sleep(11000);
		lp2.printStatus();
		lp2.turnOff();
		Thread.sleep(3000);
		lp2.printStatus();
	
	}

}
