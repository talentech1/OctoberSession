package lesson.five;

public class Cat extends Animal {
	public Cat(String name, String color, int legs, int age) {
		super(name, color, legs, age);
	}
	
	public void speak() {
		System.out.println("Meaw!!");
	}
	
	public void eat() {
		System.out.println(weight);
		System.out.println("Eating fish");
	}
}

