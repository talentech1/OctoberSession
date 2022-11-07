package lesson.six;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class W3SignhUp {

	WebDriver driver = null;

	@BeforeClass
	public void goToSignupPage() {
		String baseUrl = "https://www.w3schools.com/";
		System.setProperty("webdriver.chrome.driver", "libs/chromedriver");
		driver = new ChromeDriver();
		driver.get(baseUrl);
		WebElement loginButton = driver.findElement(By.id("w3loginbtn"));
		loginButton.click();
		WebElement signupLink = driver.findElement(By.xpath("//form/div[1]/div[1]/span/span"));
		signupLink.click();
	}

	@Test
	public void invalidEmailSignUpTest() throws InterruptedException {
		signUp("invalidEmail", "Abcdefgh1&");
		Thread.sleep(1000);
		WebElement errorTextElement = driver.findElement(By.xpath("//form/div[1]/span"));
		WebElement errorIcon = driver.findElement(By.xpath("//form/div[1]/div[2]/*[name()='svg']"));

		String errorText = errorTextElement.getText();
		Assert.assertEquals(errorText, "Looks like you forgot something");

		Assert.assertEquals(errorIcon.isDisplayed(), true, "Icon was not displayed");

	}

	@Test
	public void noNumberPasswordTest() {
		signUp("validemail@gmail.com", "A&abcdethf");
		WebElement errorIcon = driver.findElement(By.xpath("//form/div[2]/div[2]/*[name()='svg']"));
		Assert.assertEquals(errorIcon.isDisplayed(), true, "Error icon wasa not displayed");
		
		WebElement validationIcon = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[4]/div[1]/div/div[3]/li[3]/*[name()='svg']/*[name()='circle']"));
		String fillColor = validationIcon.getAttribute("fill");
		Assert.assertEquals(fillColor, "#D9212C", "Citcle icon is not red");
	}

	@AfterClass
	public void closeBrowser() {
		driver.quit();
	}

	public void signUp(String email, String password) {
		WebElement emailInput = driver.findElement(By.name("email"));
		WebElement passwordInput = driver.findElement(By.name("new-password"));
		WebElement signUpButton = driver.findElement(By.xpath("//button[1]/span[1]"));

		emailInput.sendKeys(email);
		passwordInput.sendKeys(password);
		signUpButton.click();
	}
}
