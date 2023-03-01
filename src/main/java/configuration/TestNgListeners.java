package configuration;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;



public class TestNgListeners implements ITestListener {

	static WebDriver driver;
	ExtentReports extent = ExtentReportConfig.reportConfig();
	ExtentTest test;

	public void onTestStart(ITestResult result) {
		
		test = extent.createTest(result.getName());
	}

	public void onTestSuccess(ITestResult result) {
		test.log(Status.PASS, "Test case passed");
	}
	
	public void onTestFailure(ITestResult result) {
		test.fail(result.getThrowable());
	}


	public void onTestSkipped(ITestResult result) {
	
		test.log(Status.SKIP, "Test case got skipped");
	}


	public void onFinish(ITestContext context) {
		
		extent.flush();
	}
	
}
