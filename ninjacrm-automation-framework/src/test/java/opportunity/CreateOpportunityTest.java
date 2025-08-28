package opportunity;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import generic_utility.FileUtility;

public class CreateOpportunityTest {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		FileUtility fUtil = new FileUtility();

		WebDriver driver = new EdgeDriver();
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

		String nextstepvalue = fUtil.getDataFromExcelFile("Opp", 1, 6);
		driver.findElement(By.name("nextStep")).sendKeys(nextstepvalue);

		String oppName = fUtil.getDataFromExcelFile("Opp", 1, 1);
		driver.findElement(By.name("opportunityName")).sendKeys(oppName);

		String salestagevalue = fUtil.getDataFromExcelFile("Opp", 1, 7);
		driver.findElement(By.name("salesStage")).sendKeys(salestagevalue);

		String amountvalue = fUtil.getDataFromExcelFile("Opp", 1, 2);
		driver.findElement(By.name("amount")).sendKeys(amountvalue);

		String probabilityvalue = fUtil.getDataFromExcelFile("Opp", 1, 8);
		driver.findElement(By.name("probability")).sendKeys(probabilityvalue);

		String businessTypevlaue = fUtil.getDataFromExcelFile("Opp", 1, 3);
		driver.findElement(By.name("businessType")).sendKeys(businessTypevlaue);

		String assignedTovalue = fUtil.getDataFromExcelFile("Opp", 1, 7);
		driver.findElement(By.name("assignedTo")).sendKeys(assignedTovalue);

		String expectedCloseDateValue = fUtil.getDataFromExcelFile("Opp", 1, 5);
		driver.findElement(By.name("expectedCloseDate")).sendKeys(expectedCloseDateValue);
	}
}
