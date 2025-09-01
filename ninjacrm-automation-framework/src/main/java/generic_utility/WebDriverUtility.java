package generic_utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

/**
 * This class is being used for webdriver utility methods, where actions class
 * methods, select class methods and many more methods have been used for
 * further execution
 * 
 * @author Piyush Baldaniya
 * 
 * @version 0.0.1
 * 
 */
public class WebDriverUtility {

	WebDriver driver;
	Actions act;

	public WebDriverUtility(WebDriver driver) {
		act = new Actions(driver);
		this.driver = driver;
	}

	/**
	 * To hover any of the webelement without creating actions class object
	 * 
	 * @param webelement
	 * 
	 * @return void
	 * 
	 */
	public void hover(WebElement webelement) {
		act.moveToElement(webelement).build().perform();
	}

	public void rightClick(WebElement element) {
		act.contextClick(element).build().perform();
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

		WebElement target = driver.findElement(By.linkText("Create a Page"));

		WebDriverUtility wdUtil = new WebDriverUtility(driver);

//		Actions act = new Actions(driver);
//		act.moveToElement(target).build().perform();

		wdUtil.hover(target);

		wdUtil.rightClick(target);

		Thread.sleep(3000);
		driver.quit();
	}
}
