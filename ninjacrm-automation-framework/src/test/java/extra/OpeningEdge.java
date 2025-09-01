package extra;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class OpeningEdge {
	public static void main(String[] args) throws InterruptedException {
				
		WebDriver driver = new EdgeDriver();
		Thread.sleep(3000);
		
		driver.get("http://localhost:8888/");
		
		WebElement un = driver.findElement(By.name("user_name"));
		driver.navigate().refresh();
		un.sendKeys("admin");
		
		Thread.sleep(2000);
		driver.quit();
	}
}
