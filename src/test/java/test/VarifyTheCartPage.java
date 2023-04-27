package test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import pojo.Browser;
import pom.AddToCartHomePage;
import pom.NaaptolPageSpecificationProductModel;
import utility.Parameterization;
import utility.Reports;
@Listeners(test.Listeners.class)
public class VarifyTheCartPage {
	 ExtentReports reports;
	 ExtentTest test;
	 @BeforeTest
	 public void configureReports() {
		 reports=Reports.createReport();
	 }
	
	WebDriver driver;
	@BeforeMethod
	@Parameters("Browser")
	public void browserOpen(String name)
	{
		driver=Browser.launchBrowser(name);
	}
	@Test
	public void VarifyTheProductToAddSuccefullyInCart() throws EncryptedDocumentException, IOException
	{
		NaaptolPageSpecificationProductModel naaptolPageSpecificationProductModel=new NaaptolPageSpecificationProductModel();
		naaptolPageSpecificationProductModel.ClickToCartItems();
		//naaptolPageSpecificationProductModel.
	}
}
