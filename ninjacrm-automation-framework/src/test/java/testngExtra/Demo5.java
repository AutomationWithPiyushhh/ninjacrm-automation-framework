package testngExtra;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Demo5 {
	WebDriver driver;

	@Test
	public void case11() throws InterruptedException {
		driver = new EdgeDriver();
		Thread.sleep(10000);
		driver.quit();
	}

}
