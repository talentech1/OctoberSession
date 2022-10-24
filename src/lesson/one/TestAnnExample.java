package lesson.one;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestAnnExample {
	
	@Test
	public void testOne() {
		System.out.println("Test Method One");
	}
	@Test
	public void testTwo() {
		System.out.println("Test Method Two");
	}
	
	@BeforeTest
	public void beforeT() {
		System.out.println("In before Test");
	}
	
	
	@BeforeMethod
	public void beforeM() {
		System.out.println("In before Method");
	}

}
