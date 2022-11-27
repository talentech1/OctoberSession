package lesson.seven;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import utils.TestBase;

public class TabHandleing extends TestBase {

	@Test
	public void handleTabs() {
		driver.get("http://www.costco.com");
		driver.findElement(By.linkText("Deals")).click();
		Set<String> windownIds = driver.getWindowHandles();
		Iterator<String> it = windownIds.iterator();
	
		String mainWindow = it.next();
		String dealsWindow = it.next();
		System.out.println(mainWindow);
		System.out.println(dealsWindow);
		
		driver.switchTo().window(dealsWindow);
		System.out.println(driver.getTitle());
		driver.findElement(By.cssSelector("[automation-id='subCategoryLabel_Appliances']")).click();
	}
}
