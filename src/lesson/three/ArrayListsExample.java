package lesson.three;

import java.util.ArrayList;

public class ArrayListsExample {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Raton");
		System.out.println(names);
		System.out.println(names.size());
		names.add("Nahian");
		System.out.println(names);
		System.out.println(names.size());
		names.remove(0);
		System.out.println(names);
		System.out.println(names.size());
		names.add("Sakil");
		names.add("David");
		System.out.println(names);
		names.set(2, "Mahir");
		System.out.println(names);
		System.out.println(names.get(1));
		names.clear();
		System.out.println(names.size());
		System.out.println(names);
		
	}

}
