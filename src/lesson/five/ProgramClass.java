package lesson.five;

import helpers.Utils;

public class ProgramClass {

	public static void main(String[] args) {
		Dog rufus = new Dog("Rofus", "Brown", 3, 4);
		System.out.println(rufus.name +" " + rufus.color);
		rufus.speak();
		
		Cat billy = new Cat("Billy", "white", 6, 4);
		billy.speak();
		billy.eat();
		rufus.eat();
		
		Tiger rock = new Tiger("Rock", "Brown", 15, 4, 10);
		rock.speak();
		System.out.println(rock.stripes);
		rock.hunt("Deer");
		rock.eat();
		rufus.eat();
	
		System.out.println(rock.weight);
		
		
	}

}
