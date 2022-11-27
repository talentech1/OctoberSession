package lesson.seven;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import utils.TestBase;

public class SelectDropdown extends TestBase {
	@Test
	public void dropdown() {
		driver.get("https://www.costco.com/televisions.html?keyword=TVdeals&refine=%7C%7Citem_program_eligibility-ShipIt%7C%7Citem_location_availability-in%2Bstock&deliveryFacetFlag=false");
		Select sortDropdown = new Select(driver.findElement(By.cssSelector("#sort_by")));
		List<WebElement> optionList = sortDropdown.getOptions();
		for(WebElement e:optionList) {
			System.out.println(e.getText());
		}
		
		sortDropdown.selectByVisibleText("Ratings (High to Low)");
		
	}
}
