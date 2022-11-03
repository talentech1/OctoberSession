package lesson.five;

public class Tiger extends Animal{
	int stripes;
	public Tiger(String name, String color, int legs, int age, int stripes) {
		super(name, color, legs, age);
		this.stripes = stripes;
	}
	
	public void hunt(String animal) {
		System.out.println("Hunting " + animal );
	}
	
	public void speak() {
		System.out.println("Growl!!");
	}
	
}
