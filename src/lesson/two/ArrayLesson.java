package lesson.two;

public class ArrayLesson {

	public static void main(String[] args) {
		String name = "talent";
		String[] names = {"Mahir", "Zia", "Raton", "David", "Hasina"};
		name = "Simon";
		System.out.println(name);
		System.out.println(names[4]);
		
		names[4] = "Sadia";
		System.out.println(names[1]);
		System.out.println(names[4]);
		
		System.out.println(names.length);
		
		double[] prices = {5.99, 40.00, 299.00, 50};
		prices[2] = 100;
		System.out.println(prices.length);
		System.out.println(prices[2]);
		
		int[] ages = new int[3];
		ages[1] = 20;
		System.out.println(ages[0]);
		System.out.println(ages[1]);
		System.out.println(ages[2]);
		
		int s = ages.length;
		System.out.println();
	}

}
