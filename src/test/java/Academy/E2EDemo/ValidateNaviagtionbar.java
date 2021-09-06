package Academy.E2EDemo;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.LandingPage;
import resources.base;

public class ValidateNaviagtionbar extends base {
	
	@BeforeTest
	public void tearup() throws IOException
	{
		driver = initializeDriver();
		driver.get(prop.getProperty("url"));
	}
	@Test
	public void basePageNavigation() throws IOException {
		
		LandingPage lp = new LandingPage(driver);
		AssertJUnit.assertTrue(lp.NaviagtionBar().isDisplayed());
		driver.quit();
	}
	
	@AfterTest
	public void teardown()
	{
		driver.quit();
	}
}
