package object_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	WebDriver driver;

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText = "Campaigns")
	private WebElement camp;

	@FindBy(linkText = "Contacts")
	private WebElement con;

	@FindBy(linkText = "Leads")
	private WebElement leads;

	@FindBy(linkText = "Opportunities")
	private WebElement opp;

	@FindBy(linkText = "Products")
	private WebElement product;

	@FindBy(linkText = "Quotes")
	private WebElement quot;

	@FindBy(linkText = "Purchase Order")
	private WebElement po;

	@FindBy(linkText = "Sales Order")
	private WebElement so;

	@FindBy(linkText = "Invoice")
	private WebElement invoice;

	@FindBy(linkText = "Admin Console")
	private WebElement adConsole;

	@FindBy(xpath = "//div[text()='Create User']")
	private WebElement createUser;

	@FindBy(xpath = "//div[text()='View Users']")
	private WebElement viewUser;

	@FindBy(xpath = "//div[@class='user-icon']")
	private WebElement profile;

	@FindBy(xpath = "//div[text()='Logout ']")
	private WebElement logOut;

	public WebElement getCamp() {
		return camp;
	}

	public WebElement getCon() {
		return con;
	}

	public WebElement getLeads() {
		return leads;
	}

	public WebElement getOpp() {
		return opp;
	}

	public WebElement getProduct() {
		return product;
	}

	public WebElement getQuot() {
		return quot;
	}

	public WebElement getPo() {
		return po;
	}

	public WebElement getSo() {
		return so;
	}

	public WebElement getInvoice() {
		return invoice;
	}

	public WebElement getAdConsole() {
		return adConsole;
	}

	public WebElement getCreateUser() {
		return createUser;
	}

	public WebElement getViewUser() {
		return viewUser;
	}

	public WebElement getProfile() {
		return profile;
	}

	public WebElement getLogOut() {
		return logOut;
	}

}
