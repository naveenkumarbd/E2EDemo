package resources;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReporterNg {
	static public ExtentReports extent;

	public static ExtentReports getReportObject() {
		ExtentTest test = extent.createTest("");
		String path = System.getProperty("user.home") + "\\reports\\index.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setDocumentTitle("ExtentReport-naveen");
		reporter.config().setReportName("naveen");
		extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "naveen");
		return getReportObject();

	}

}
