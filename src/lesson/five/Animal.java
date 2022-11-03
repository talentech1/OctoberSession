package lesson.five;

public abstract class Animal {
	String name;
	String color;
	int legs;
	String eats;
	int age;
	
	protected int weight =100;
	
	public Animal(String name, String color, int legs, int age) {
		this.name = name;
		this.age = age;
		this.color = color;
		this.legs = legs;
	}
	
	public void eat() {
		System.out.println("Eating");
	}

	abstract public void speak();
}
