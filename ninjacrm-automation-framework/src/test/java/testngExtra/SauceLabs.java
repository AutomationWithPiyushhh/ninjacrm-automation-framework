package testngExtra;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class SauceLabs {
	@Test(invocationCount = 4)
	public void logginInSauceLabs() throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://www.saucedemo.com/v1/");

//		login with same set of data
		WebElement un = driver.findElement(By.id("user-name"));
		un.sendKeys("standard_user");

		WebElement pwd = driver.findElement(By.id("password"));
		pwd.sendKeys("secret_sauce");

		WebElement loginBtn = driver.findElement(By.id("login-button"));
		loginBtn.click();

		Thread.sleep(5000);
		driver.quit();
	}
}
