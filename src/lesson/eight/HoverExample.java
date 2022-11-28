package lesson.eight;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import utils.TestBase;

public class HoverExample extends TestBase{
	/* GO to browserstack.com
	 * hover over product
	 */
	
	@Test
	public void testHover() {
		driver.get("https://www.browserstack.com/");
		WebElement productMenu = driver.findElement(By.id("product-menu-toggle"));
		Actions seleniumAction = new Actions(driver);
		seleniumAction.moveToElement(productMenu).perform();
	}
}
