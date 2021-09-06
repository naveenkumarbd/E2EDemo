package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "user_email")
	WebElement getemail;

	@FindBy(id = "user_password")
	WebElement getPassword;

	@FindBy(xpath = "//input[@value='Log In']")
	WebElement submitButton;



	public WebElement getPassword() {
		return getPassword;
	}

	public WebElement submitButton() {
		return submitButton;
	}

	public WebElement getEmail() {
		// TODO Auto-generated method stub
		return getemail;
	}

}
