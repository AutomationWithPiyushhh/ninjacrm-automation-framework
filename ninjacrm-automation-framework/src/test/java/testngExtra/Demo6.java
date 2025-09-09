package testngExtra;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Demo6 {
	WebDriver driver;

	@Test
	public void case12() throws InterruptedException {
		driver = new FirefoxDriver();
		Thread.sleep(10000);
		driver.quit();
	}
}
