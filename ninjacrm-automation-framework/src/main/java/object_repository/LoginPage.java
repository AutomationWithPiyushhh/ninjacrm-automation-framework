package object_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
//	rule 1 => No. of webpages = No. of POMpages
//	rule 2 => No. of web elements = No. of web element reference/variables
//	rule 3 => declare them private
//	rule 4 => get them via getters
//	rule 5 => initialize them via initElements()
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id = "username")
	private WebElement un;

	@FindBy(name = "password")
	private WebElement pwd;

	@FindBy(tagName = "button")
	private WebElement signIn;

	@FindBy(linkText = "Forgot password?")
	private WebElement forPwd;

	@FindBy(xpath = "//a[text()='Create Account']")
	private WebElement createAcc;

	public WebElement getUn() {
		return un;
	}

	public WebElement getPwd() {
		return pwd;
	}

	public WebElement getSignIn() {
		return signIn;
	}

	public WebElement getForPwd() {
		return forPwd;
	}

	public WebElement getCreateAcc() {
		return createAcc;
	}

}
