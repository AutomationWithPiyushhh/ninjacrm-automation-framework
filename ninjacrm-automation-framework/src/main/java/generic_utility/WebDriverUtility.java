package generic_utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WebDriverUtility {

	WebDriver driver;

	public WebDriverUtility(WebDriver driver) {
		this.driver = driver;
	}

	public void hover(WebElement element) {
		Actions act = new Actions(driver);
		act.moveToElement(element).build().perform();
	}
	
	public void rightClick(WebElement element) {
		Actions act = new Actions(driver);
		act.contextClick(element).build().perform();		
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

		WebElement target = driver.findElement(By.linkText("Create a Page"));

		WebDriverUtility wdUtil = new WebDriverUtility(driver);
		
//		wdUtil.hover(target);
		wdUtil.rightClick(target);
		
		Thread.sleep(3000);
		driver.quit();
	}
}
