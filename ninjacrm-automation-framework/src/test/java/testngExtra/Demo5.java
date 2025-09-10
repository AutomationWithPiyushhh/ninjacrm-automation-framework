package testngExtra;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Demo5 {
	WebDriver driver;

	
	@Test
	public void createCity() throws InterruptedException {
		driver = new ChromeDriver();
		Thread.sleep(100);
		driver.quit();
	}

	@Test(dependsOnMethods = {"deleteCity","createCity"})
	public void modifyCity() throws InterruptedException {
		driver = new ChromeDriver();
		Thread.sleep(100);
		driver.quit();
	}

	
	@Test(dependsOnMethods = "createCity")
	public void deleteCity() throws InterruptedException {
		driver = new ChromeDriver();
		Thread.sleep(100);
		driver.quit();
	}
}
