package lesson.eight;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utils.TestBase;

public class FileUpload extends TestBase {
	@Test
	public void uploadFile() {
		driver.get("https://image.online-convert.com/convert-to-jpg");
		WebElement uploadFileInput = driver.findElement(By.id("fileUploadInput"));
		uploadFileInput.sendKeys("/Users/msiddique/eclipse-workspace/OctoberSession/libs/hero-png.avif");
		
	}
}
