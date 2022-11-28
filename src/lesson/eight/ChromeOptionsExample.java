package lesson.eight;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class ChromeOptionsExample {
	@Test
	public void optionsExample() {
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--window-size=1920,1080");
		WebDriver driver = new ChromeDriver(chromeOptions);
	
		driver.get("http://www.browserstack.com");
	}
}
