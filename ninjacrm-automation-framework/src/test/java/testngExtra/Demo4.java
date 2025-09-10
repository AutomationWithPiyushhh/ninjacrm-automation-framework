package testngExtra;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo4 {
	WebDriver driver;

	@Test(priority = 3)
	public void case11() throws InterruptedException {
		driver = new ChromeDriver();
		Thread.sleep(100);
		driver.quit();
	}

	@Test(priority = 2)
	public void case12() throws InterruptedException {
		driver = new ChromeDriver();
		Thread.sleep(100);
		driver.quit();
	}

	@Test(priority = 1)
	public void case13() throws InterruptedException {
		driver = new ChromeDriver();
		Thread.sleep(1000);
		driver.quit();
	}
	
	@Test(priority = 0)
	public void case14() throws InterruptedException {
		driver = new ChromeDriver();
		Thread.sleep(100);
		driver.quit();
	}
	
	@Test(priority = -1)
	public void case15() throws InterruptedException {
		driver = new ChromeDriver();
		Thread.sleep(100);
		driver.quit();
	}

}
