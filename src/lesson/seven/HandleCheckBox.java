package lesson.seven;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandleCheckBox {

	@Test
	public void testCheckbox() throws InterruptedException {
		String baseUrl = "https://www.costco.com/";
		System.setProperty("webdriver.chrome.driver", "libs/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(baseUrl);
		WebElement signInLink = driver.findElement(By.linkText("Sign In / Register"));
		signInLink.click();
		WebElement rememberMeCheckbox = driver.findElement(By.id("rememberMe"));
		Thread.sleep(2000);
		if (!rememberMeCheckbox.isSelected()) {
			rememberMeCheckbox.click();
		}
		System.out.println(rememberMeCheckbox.isSelected());
	}
}
