package lesson.four;

import java.util.HashMap;

public class HashMapExample {

	public static void main(String[] args) {
		
		HashMap<String, Integer> testScores = new HashMap<String, Integer>();
		System.out.println(testScores);
		
		testScores.put("Raton", 100);
		testScores.put("Shakil", 80);
		testScores.put("Nate", 90);
		testScores.put("David", 95);
		System.out.println(testScores);
		System.out.println(testScores.get("shakil"));
		System.out.println(testScores.size());
		testScores.put("Raton", 99);
		System.out.println(testScores);
		System.out.println(testScores.keySet());
		for(String student:testScores.keySet()) {
			System.out.println(student + " : "  + testScores.get(student) );
		}
		
		
	}

}
