package lesson.seven;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import utils.BrowserHelper;

public class ExpectedConditionWait {
	@Test
	public void testExplicitWait() {
		BrowserHelper browser = new BrowserHelper("Chrome");
		browser.driver.get("https://www.costco.com/");
		
		WebDriverWait wait = new WebDriverWait(browser.driver, Duration.ofSeconds(10));
		WebElement emailInput = browser.driver.findElement(By.id("epEmailId"));
		//wait.until(ExpectedConditions.visibilityOf(emailInput));
		
		
		emailInput.sendKeys("randomemail@gmail.com");
		WebElement memmership = browser.driver.findElement(By.id("custom_membernumber"));
		memmership.sendKeys("132312");
	}
}
