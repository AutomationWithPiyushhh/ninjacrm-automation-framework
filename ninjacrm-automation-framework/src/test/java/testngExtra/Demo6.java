package testngExtra;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Demo6 {

	@Test(dataProvider = "getData")
	public void loggingInFB(String username, String password) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://www.facebook.com/");

		WebElement un = driver.findElement(By.id("email"));
		WebElement pwd = driver.findElement(By.id("pass"));

		un.sendKeys(username);
		pwd.sendKeys(password);

		driver.findElement(By.name("login")).click();

		Thread.sleep(1000);
		driver.quit();

	}

	@DataProvider
	public Object[][] getData() {
		Object[][] credentials = new Object[4][2];
		credentials[0][0] = "Faizan";
		credentials[0][1] = "Faizan@123";

		credentials[1][0] = "Shivang";
		credentials[1][1] = "Shivang@12345";

		credentials[2][0] = "Manisha";
		credentials[2][1] = "Manisha@123";

		credentials[3][0] = "Namrata";
		credentials[3][1] = "Namrata@123";

		return credentials;
	} 
}
