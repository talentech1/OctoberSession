package review.five;

import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class TestngExample {
	
	public void testDate() {
		int res = 5+8;
		Assert.assertEquals(res, 13);
	}
	
	
	public void testMonth() {
		boolean a = true;
		Assert.assertTrue(a);
		Assert.assertEquals(13, 13);
	}
	
	public void testYear() {
		boolean a = true;
		Assert.assertTrue(a);
		Assert.assertEquals(13, 13);
	}
	

}
