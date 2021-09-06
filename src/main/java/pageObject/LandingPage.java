package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
	public WebDriver driver;

	public LandingPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(css = "a[href*='sign_in']")
	WebElement loginbutton;

	@FindBy(partialLinkText = "Home")
	WebElement Title;

	@FindBy(css = "ul[class*='navigation clearfix']")
	WebElement naviagationBar;

//"ul[class*='navigation clearfix']"

	public WebElement loginbutton() {
		// TODO Auto-generated method stub
		return loginbutton;
	}

	public WebElement getTitle() {
		// TODO Auto-generated method stub
		return Title;
	}

	public WebElement NaviagtionBar() {
		// TODO Auto-generated method stub
		return naviagationBar;
	}

}
