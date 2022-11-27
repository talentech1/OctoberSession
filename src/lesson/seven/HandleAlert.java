package lesson.seven;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import org.testng.annotations.Test;

import utils.TestBase;

public class HandleAlert extends TestBase {
	@Test
	public void testAlert() {
		driver.get("file:///Users/msiddique/eclipse-workspace/OctoberSession/HtmlPages/Alert.html");
		driver.findElement(By.cssSelector("body > button")).click();
		Alert alert = driver.switchTo().alert();
		String alaertText = alert.getText();
		System.out.println(alaertText);
		alert.dismiss();
		
		
	}
}
