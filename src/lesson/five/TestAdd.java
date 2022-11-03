package lesson.five;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAdd {

	@Test
	public void testAddWithTwoInt() {
		int actual = Calculator.add(5, 6);
		int expected = 11;
		Assert.assertEquals(actual, expected);
	}

	@Test
	public void testAddWithThreeInt() {
		int res = Calculator.add(5, 6, 1);
		int exp = 12;
		Assert.assertEquals(res, exp);
	}

	@Test
	public void testDevide() {
		double res = Calculator.devide(10, 5);
		int exp = 2;
		Assert.assertEquals(res, exp);
	}
	
	@Test
	public void devideByZero() {
		Assert.assertThrows(null);
	}
	

}
