package campaign;

import java.io.IOException;

import org.junit.AfterClass;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import base_utility.BaseClass;
import junit.framework.Assert;
import object_repository.CampaignPage;
import object_repository.HomePage;

public class CreateCampaignTest extends BaseClass{
	@Test
	public void createCampaignTest() throws IOException, InterruptedException {
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
		Assert.assertEquals(actcName, cName);
	}
}
