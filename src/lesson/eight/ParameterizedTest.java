package lesson.eight;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utils.TestBase;

public class ParameterizedTest extends TestBase {
	@Test(dataProvider= "InvalidEmailAddresses")
	public void testAlert(String email) {
		driver.get("https://profile.w3schools.com/log-in");
		WebElement signUpLink = driver.findElement(By.xpath("//form/div[1]/div[1]/span/span"));
		signUpLink.click();
		WebElement emailInputFiled = driver.findElement(By.id("modalusername"));
		WebElement passwordInputField = driver.findElement(By.id("new-password"));
		WebElement signUpButton = driver
				.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[4]/div[1]/div/div[5]/div[1]/button"));
		emailInputFiled.sendKeys(email);
		signUpButton.click();
		WebElement emailErrorMsg = driver
				.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[4]/div[1]/div/div[2]/form/div[1]/span"));
		Assert.assertEquals(emailErrorMsg.getText(), "Looks like you forgot something");
	}

	
	@DataProvider(name="InvalidEmailAddresses")
	public Object[] invalidEmainAddresses() {
		String[] invalidEmails = {"teant tech@gamil.com", "talatnet@gmail", "sasfs%%%saf@gmail.com", ""};
		return invalidEmails;
	}
}
