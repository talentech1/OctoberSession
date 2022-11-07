package lesson.six;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstSeleniumClass {

	public static void main(String[] args) {
		String browser = "chrome";
		WebDriver driver = null;

		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "libs/chromedriver");
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.firefox.driver", "libs/geckodriver");
			driver = new FirefoxDriver();
		}

		driver.get("http://google.com");
		WebElement searchInputBox = driver.findElement(By.name("q"));
		searchInputBox.sendKeys("talentTech");
		WebElement body =  driver.findElement(By.tagName("body"));
		body.click();
		//driver.close();
	}

}
