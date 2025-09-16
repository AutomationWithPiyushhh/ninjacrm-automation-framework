package testngExtra;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Demo7 {

	@Test
	public void case1() throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		Thread.sleep(2000);
		driver.quit();
	}
	
}
