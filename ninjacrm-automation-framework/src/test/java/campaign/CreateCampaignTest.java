package campaign;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import generic_utility.FileUtility;
import object_repository.CampaignPage;
import object_repository.HomePage;
import object_repository.LoginPage;

public class CreateCampaignTest {
	public static void main(String[] args) throws IOException, InterruptedException {

//		Get the data from properties file
		FileUtility fUtil = new FileUtility();
		String BROWSER = fUtil.getDataFromPropFile("bro");
		String URL = fUtil.getDataFromPropFile("url");
		String USERNAME = fUtil.getDataFromPropFile("un");
		String PASSWORD = fUtil.getDataFromPropFile("pwd");

		WebDriver driver = null;

		if (BROWSER.contains("chrome")) {
			driver = new ChromeDriver();
		} else if (BROWSER.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		} else {
			driver = new EdgeDriver();
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

//		Login
		driver.get(URL);

		LoginPage lp = new LoginPage(driver);
		lp.getUn().sendKeys(USERNAME);
		lp.getPwd().sendKeys(PASSWORD);
		lp.getSignIn().click();

//		Create campaign
		String cName = "kjhbvcdrtgvcfg";

		HomePage hp = new HomePage(driver);
		hp.getCamp().click();

		CampaignPage cp = new CampaignPage(driver);

		cp.getCreateCamp().click();
		cp.getCampName().sendKeys(cName);
		cp.getTargetSize().sendKeys("15");
		cp.getCreateCampButton().click();

//		Verification
		String actcName = driver.findElement(By.xpath("//td[text()='" + cName + "']")).getText();
		if (actcName.equals(cName)) {
			System.out.println("Campaign Created Successfully!!!");
		}

//		Logout
		
		driver.findElement(By.xpath("//button[@aria-label='close']")).click();
		
		Actions act = new Actions(driver);
		act.moveToElement(hp.getProfile()).build().perform();

	
		hp.getLogOut().click();

		driver.quit();
	}
}
