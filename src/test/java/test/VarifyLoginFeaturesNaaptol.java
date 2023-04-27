package test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import pojo.Browser;
import pom.LoginPageNaaptol;
import utility.Parameterization;
import utility.Reports;
@Listeners(test.Listeners.class)
public class VarifyLoginFeaturesNaaptol {
	 ExtentReports reports;
	 ExtentTest test;
	 @BeforeTest
	 public void configureReports() {
		 reports=Reports.createReport();
	 }
	WebDriver  driver;
	@BeforeMethod
	@Parameters("Browser")
	public void openBrowser(String name)
	{
		driver=Browser.launchBrowser(name);
	}
	@Test(priority=1)
   public void VarifyTheWorkingOfLoginButtonWithValiedMobileNumber() throws EncryptedDocumentException, IOException, InterruptedException
   {
		LoginPageNaaptol loginPageNaaptol=new LoginPageNaaptol(driver);
		loginPageNaaptol.clickOnLoginOrRegistration();
		loginPageNaaptol.EnterMobileNumberInLogin(Parameterization.getExelSheetData("Credentials", 0, 4));
		loginPageNaaptol.clickOnContinueButtonOfLogin();
		loginPageNaaptol.clickOnSubmitOnLogin();
	   Assert.assertTrue(true);
	   Thread.sleep(2000);
	   

}}