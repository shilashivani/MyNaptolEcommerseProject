package test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import pojo.Browser;
import pom.NaaptolHomePage;
import utility.Parameterization;
import utility.Reports;
import utility.Screenshot;
@Listeners(test.Listeners.class)
public class VerifyProductAreDisplayedSearch {
	 ExtentReports reports;
	 ExtentTest test;
	 @BeforeTest
	 public void configureReports() {
		 reports=Reports.createReport();
	 }
	WebDriver driver;
	
	@BeforeMethod
	@Parameters("Browser")
	public void openBrowser(String name)
	{
		driver=Browser.launchBrowser(name);
	}
	@Test
	public void varifyAreProductDisplyedValiedSearch() throws EncryptedDocumentException, IOException
	{
		NaaptolHomePage naaptolHomePage= new NaaptolHomePage(driver);
		naaptolHomePage.enterProductToSearch(Parameterization.getExelSheetData("Credentials", 0, 0));
		naaptolHomePage.clickOnToSearchButton();
		int products=naaptolHomePage.getNumberOfProduct();
		System.out.println(products);
		Assert.assertTrue(products>0);
		
    }
	@Test
	public void varifyAreProductDisplyedInValiedSearch() throws EncryptedDocumentException, IOException
	{
		NaaptolHomePage naaptolHomePage= new NaaptolHomePage(driver);
		naaptolHomePage.enterProductToSearch(Parameterization.getExelSheetData("Credentials", 1, 0));
		naaptolHomePage.clickOnToSearchButton();
		int products=naaptolHomePage.getNumberOfProduct();
		System.out.println(products);
		Assert.assertEquals(products,0);
	
    }
}
	

