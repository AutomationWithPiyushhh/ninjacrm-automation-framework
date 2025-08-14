package extra;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class OpeningEdge {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\User\\Basic_Selenium\\ninjacrm-automation-framework\\resources\\msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		Thread.sleep(3000);
		driver.quit();
	}
}
