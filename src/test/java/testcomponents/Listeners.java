package testcomponents;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import commonutilities.CommonFunctions;
import resources.ExtentReporterNG;

public class Listeners extends CommonFunctions implements ITestListener {
	public static ExtentTest test;
	ExtentReports extent = ExtentReporterNG.getReportObject();

	@Override
	public void onTestStart(ITestResult result) {
		test = extent.createTest(result.getMethod().getMethodName());
		test.log(Status.INFO, "Test case started execution: " + result.getMethod().getMethodName());
	}

	// Method for adding logs passed from test cases
	public void reportLog(String displaymessage) {
		test.log(Status.INFO, "ASSERT EQUALS PASSED : " + displaymessage);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		test.pass("Test case passed is: " + result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		test.fail("Test case failed is: " + result.getName());
		test.fail("Test case error or exception: " + result.getThrowable());
		String filepath = null;
		try {
			driver = (WebDriver) result.getTestClass().getRealClass().getField("driver").get(result.getInstance());
		} catch (Exception el) {
			// TODO Auto-generated catch block
			el.printStackTrace();
		}

		try {
			filepath = getScreenShot(result.getMethod().getMethodName());
		} catch (IOException iel) {
			// TODO Auto-generated catch block
			iel.printStackTrace();
		}

		test.addScreenCaptureFromPath(filepath, result.getMethod().getMethodName());

	}

	@Override
	public void onFinish(ITestContext context) {
		extent.flush();

	}

	@Override
	public void onTestSkipped(ITestResult result) {

	}
}
