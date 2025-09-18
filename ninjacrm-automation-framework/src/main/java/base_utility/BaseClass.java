package base_utility;

import java.io.IOException;
import java.time.Duration;

import org.junit.AfterClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import generic_utility.FileUtility;
import object_repository.HomePage;
import object_repository.LoginPage;

public class BaseClass {

	public WebDriver driver;

	@BeforeClass
	public void openBro() throws IOException {
		FileUtility fUtil = new FileUtility();
		String BROWSER = fUtil.getDataFromPropFile("bro");

		if (BROWSER.contains("chrome")) {
			driver = new ChromeDriver();
		} else if (BROWSER.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		} else {
			driver = new EdgeDriver();
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}

	@BeforeMethod
	public void login() throws IOException {
//		Get the data from properties file
		FileUtility fUtil = new FileUtility();
		String URL = fUtil.getDataFromPropFile("url");
		String USERNAME = fUtil.getDataFromPropFile("un");
		String PASSWORD = fUtil.getDataFromPropFile("pwd");

//		Login
		driver.get(URL);
		LoginPage lp = new LoginPage(driver);
		lp.getUn().sendKeys(USERNAME);
		lp.getPwd().sendKeys(PASSWORD);
		lp.getSignIn().click();
	}

	@AfterMethod
	public void logout() {
//		Logout
		driver.findElement(By.xpath("//button[@aria-label='close']")).click();
		HomePage hp = new HomePage(driver);

		Actions act = new Actions(driver);
		act.moveToElement(hp.getProfile()).build().perform();

		hp.getLogOut().click();
	}

	@AfterClass
	public void closeBro() {
		driver.quit();
	}

}
