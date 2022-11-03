package lesson.five;

import java.nio.file.spi.FileSystemProvider;

public class Dog extends Animal {
	public Dog(String name, String color, int legs, int age) {
		super(name, color, legs, age);
	}
	
	public void speak() {
		System.out.println("Bark!! Bark!!");
		
	}
	
}
