package lesson.eight;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import utils.TestBase;

public class DownloadFileExample{
	@Test
	public void downLoadFile() {
		ChromeOptions chromeOptions = new ChromeOptions();
		//chromeOptions.addArguments("--window-size=1920,1080");
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("download.default_directory", "/Users/msiddique/eclipse-workspace/OctoberSession/libs");
		chromeOptions.setExperimentalOption("prefs", prefs);
		
		WebDriver driver = new ChromeDriver(chromeOptions);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://chromedriver.storage.googleapis.com/index.html?path=108.0.5359.22/");
		
		driver.findElement(By.linkText("chromedriver_linux64.zip")).click();
	}
}
