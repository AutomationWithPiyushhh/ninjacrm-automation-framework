package campaign;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class CreateCampaignTest {
	public static void main(String[] args) throws IOException, InterruptedException {
		FileInputStream fis = new FileInputStream("C:\\Users\\User\\Basic_Selenium\\ninjacrm-automation-framework\\src\\test\\resources\\commonData.properties");
		
		Properties pObj = new Properties();
		pObj.load(fis);
		
		String BROWSER = pObj.getProperty("bro");
		String URL = pObj.getProperty("url");
		String USERNAME = pObj.getProperty("un");
		String PASSWORD = pObj.getProperty("pwd");
		
		WebDriver driver = null;
		
		if (BROWSER.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (BROWSER.equalsIgnoreCase("edge")){
			driver = new EdgeDriver();
		}else {
			driver = new EdgeDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get(URL);
		
//		login
		driver.findElement(By.id("username")).sendKeys(USERNAME);
		driver.findElement(By.id("inputPassword")).sendKeys(PASSWORD);
		driver.findElement(By.xpath("//button[text()='Sign In']")).click();
		
		
//		Create campaign
		driver.findElement(By.linkText("Campaigns")).click();
		
		driver.findElement(By.xpath("//span[text()='Create Campaign']")).click();
			
//		driver.findElement(By.name("expectedCloseDate")).sendKeys("2025-08-15");
		
		String cName = "kjhbvcdrtgvcfg";
		
		driver.findElement(By.name("campaignName")).sendKeys(cName);
		
		driver.findElement(By.name("targetSize")).sendKeys("15");
		
		driver.findElement(By.xpath("//button[text()='Create Campaign']")).click();
		
//		Verification
		String actcName = driver.findElement(By.xpath("//td[text()='"+cName+"']")).getText();
		if (actcName.equals(cName)) {
			System.out.println("Campaign Created Successfully!!!");
		}
		
		
		Thread.sleep(2000);
		driver.quit();
	}
}
