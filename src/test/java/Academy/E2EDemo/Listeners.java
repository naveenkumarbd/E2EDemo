package Academy.E2EDemo;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import resources.ExtentReporterNg;
import resources.base;

public class Listeners extends base implements ITestListener {

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.testng.ITestListener#onTestStart(org.testng.ITestResult)
	 */
	ExtentTest test;
	ExtentReports extent = ExtentReporterNg.getReportObject();
	ThreadLocal<ExtentTest> extentTest=new ThreadLocal<ExtentTest>();
	public void onTestStart(ITestResult result) {
		test = extent.createTest("inital Demo");
		extentTest.set(test);
	}

	public void onTestSuccess(ITestResult result) {
		test.log(Status.PASS, "Test Passed");

	}

	public void onTestFailure(ITestResult result) {
		test.fail(result.getThrowable());
		WebDriver driver = null;

		String testMethodName = result.getMethod().getMethodName();
		try {
			driver = (WebDriver) result.getTestClass().getRealClass().getDeclaredField("driver")
					.get(result.getInstance());
		} catch (IllegalArgumentException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IllegalAccessException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (NoSuchFieldException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (SecurityException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

	public void onTestSkipped(ITestResult result) {

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	}

	public void onTestFailedWithTimeout(ITestResult result) {
	}

	public void onStart(ITestContext context) {

	}

	public void onFinish(ITestContext context) {

	}

}
