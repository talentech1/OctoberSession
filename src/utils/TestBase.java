package utils;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;

public class TestBase {
	public WebDriver driver;
	@BeforeTest
	public void setup() {
		BrowserHelper browser = new BrowserHelper("chrome");
		this.driver = browser.getDriver();
	}
}
