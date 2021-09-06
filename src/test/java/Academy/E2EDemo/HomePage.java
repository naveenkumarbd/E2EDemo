package Academy.E2EDemo;

import org.testng.annotations.Test;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObject.LandingPage;
import pageObject.LoginPage;
import resources.base;

public class HomePage extends base {
	
	
	@BeforeTest
	public void tearup() throws IOException
	{
		driver = initializeDriver();
		
	}
	
	@Test(dataProvider = "getData")
	public void basePageNavigation(String username, String Password) throws IOException {
		driver.get(prop.getProperty("url"));
		LandingPage lp = new LandingPage(driver);
		lp.loginbutton().click();
		LoginPage lp1 = new LoginPage(driver);
		lp1.getEmail().sendKeys(username);
		lp1.getPassword().sendKeys(Password);
		lp1.submitButton().click();
	

	}

	@DataProvider
	public Object[][] getData() {

		Object[][] data = new Object[2][2];
		data[0][0] = "naveenroa@gmail.com";
		data[0][1] = "naveen123";
		data[1][0] = "naveenroa1992@gmail.com";
		data[1][1] = "naveen123";
		return data;

	}
	
	@AfterTest
	public void teardown()
	{
		driver.quit();
	}

}
