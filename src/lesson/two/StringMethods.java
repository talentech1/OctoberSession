package lesson.two;

public class StringMethods {

	public static void main(String[] args) {
		String a = "Today is a sunny Autum day";
		System.out.println(a.length());
		System.out.println(a);
		a = a.replace(" ", "");
		System.out.println(a);
		System.out.println(a.length());
		System.out.println(a.charAt(3));
		System.out.println(a.equals("Sunday"));
		System.out.println(a.toLowerCase());
	}

}
