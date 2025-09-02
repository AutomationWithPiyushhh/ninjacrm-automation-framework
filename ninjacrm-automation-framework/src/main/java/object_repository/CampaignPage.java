package object_repository;

import java.awt.print.PageFormat;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CampaignPage {

	WebDriver driver;
	
	public CampaignPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[text()='Create Campaign']")
	private WebElement createCamp;

	public WebElement getCreateCamp() {
		return createCamp;
	}
	
	@FindBy(name = "campaignName")
	private WebElement campName;
	
	@FindBy(name = "targetSize")
	private WebElement targetSize;

	@FindBy(xpath = "//button[text()='Create Campaign']")
	private WebElement createCampButton;
	
//	@FindBy(xpath = "//td[text()='\" + cName + \"']") // Drawback 

	public WebElement getCampName() {
		return campName;
	}

	public WebElement getTargetSize() {
		return targetSize;
	}
	
	public WebElement getCreateCampButton() {
		return createCampButton;
	}
	
}
