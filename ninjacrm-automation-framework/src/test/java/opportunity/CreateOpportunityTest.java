package opportunity;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateOpportunityTest {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("http://49.249.28.218:8098/");
		
		String un = "Rmgyantra";
		String pwd = "rmgy@9999";
		
		driver.findElement(By.id("username")).sendKeys(un);
		driver.findElement(By.id("inputPassword")).sendKeys(pwd);
		driver.findElement(By.xpath("//button[text()='Sign In']")).click();
		
		driver.findElement(By.linkText("Opportunities")).click();
		
		driver.findElement(By.xpath("//span[text()='Create Opportunity']")).click();

		driver.findElement(By.name("nextStep"));
		driver.findElement(By.name("opportunityName"));
		driver.findElement(By.name("salesStage"));
		driver.findElement(By.name("amount"));
		driver.findElement(By.name("probability"));
		driver.findElement(By.name("businessType"));
		driver.findElement(By.name("businessType"));
		driver.findElement(By.name("businessType"));
		driver.findElement(By.name("businessType"));
		
		
	}
}
