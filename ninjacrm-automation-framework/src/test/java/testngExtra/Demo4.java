package testngExtra;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo4 {
	WebDriver driver;

	@Test
	public void case10() throws InterruptedException {
		driver = new ChromeDriver();
		Thread.sleep(10000);
		driver.quit();
	}

}
