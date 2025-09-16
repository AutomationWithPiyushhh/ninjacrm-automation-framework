package testngExtra;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Demo7 {
	@Parameters("browser")
	@Test
	public void case1(String browser) throws InterruptedException {
		WebDriver driver = null;

		if (browser.equals("chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equals("edge")) {
			driver = new EdgeDriver();
		} else if (browser.equals("firefox")) {
			driver = new FirefoxDriver();
		}

		System.out.println(browser + " is opened...");

		Thread.sleep(10000);
		driver.quit();
	}

}
