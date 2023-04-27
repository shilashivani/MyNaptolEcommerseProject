package test;

import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

import utility.Screenshot;

public class Listeners extends BaseTest implements ITestListener {
	//WebDriver driver;
	public void onTestStart(ITestResult result)
	{
		System.out.println("Test Started"+result.getName());
	}
	public void onTestFailure(ITestResult result) {
		Screenshot.takesceenshot(driver, result.getName());
	}
	public void OnSkipped(ITestResult result) {
		System.out.println("Test Skipped"+result.getName());
	}
	public void OnTestSuccess(ITestResult result) {
		System.out.println("Test Success"+result.getName());
	}
}


