package object_repository;

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

	@FindBy(name = "campaignName")
	private WebElement campName;

//	@FindBys({
//		@FindBy(name = "submit_button"),
//		@FindBy(id = "submit"),
//		@FindBy(xpath = "//button[@title='abc']")
//		})
//	private WebElement submitBtn1;

//	@FindAll({
//		@FindBy(name = "sign_in"),
//		@FindBy(id = "login"),
//		@FindBy(xpath = "//button[@title='xyz']")
//		})
//	private WebElement submitBtn2;

	@FindBy(name = "targetSize")
	private WebElement targetSize;

	@FindBy(xpath = "//button[text()='Create Campaign']")
	private WebElement createCampButton;

//	@FindBy(xpath = "//td[text()='\" + cName + \"']") // Drawback 

	public WebElement getCreateCamp() {
		return createCamp;
	}

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
