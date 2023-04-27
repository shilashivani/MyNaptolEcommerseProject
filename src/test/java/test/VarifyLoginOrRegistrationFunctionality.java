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
import pom.LogoutPageNaaptol;
import pom.NaaptolHomePage;
import utility.Parameterization;
import utility.Reports;
@Listeners(test.Listeners.class)
public class VarifyLoginOrRegistrationFunctionality {
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
	   NaaptolHomePage naaptolHomePage=new NaaptolHomePage(driver);
	   naaptolHomePage.cickOnLoginOrRegistration();
	   naaptolHomePage.EnterMobileNumberInLogin(Parameterization.getExelSheetData("Credentials", 3, 0));
	   naaptolHomePage.clickOnContinueButtonOfLogin();
	   naaptolHomePage.clickOnSubmitOnLogin();
	   Assert.assertTrue(true);
	   Thread.sleep(2000);
	   LogoutPageNaaptol logoutPageNaaptol=new LogoutPageNaaptol(driver);
	   
		logoutPageNaaptol.ClickOntoLogOutButton(driver);
	   
	  // System.out.println("Getting succefully reply");
	}
	@Test(priority=2)
	   public void VarifyTheWorkingOfLoginButtonWithInValiedMobileNumber() throws EncryptedDocumentException, IOException, InterruptedException
	   {
		   NaaptolHomePage naaptolHomePage=new NaaptolHomePage(driver);
		   naaptolHomePage.cickOnLoginOrRegistration();
		   naaptolHomePage.EnterMobileNumberInLogin(Parameterization.getExelSheetData("Credentials", 1, 4));
		   naaptolHomePage.clickOnContinueButtonOfLogin();
		   naaptolHomePage.clickOnSubmitOnLogin();
		   Assert.assertFalse(false);
		//   System.out.println("Getting not succefully reply"); 
		  
	  } 
//	public void VarifyTheWorkingOfLogOutButton() {
//		LogoutPageNaaptol logoutPageNaaptol=new LogoutPageNaaptol(driver);
//		logoutPageNaaptol.ClickOntoLogOutButton();
//	}
}
