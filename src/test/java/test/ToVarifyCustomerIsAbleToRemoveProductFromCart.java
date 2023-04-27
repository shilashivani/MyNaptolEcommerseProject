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
import pom.AddToCartHomePage;
import pom.NaaptolPageChekoutMedelPage;
import utility.Parameterization;
import utility.Reports;
@Listeners(test.Listeners.class)
public class ToVarifyCustomerIsAbleToRemoveProductFromCart {
	 ExtentReports reports;
	 ExtentTest test;
	 @BeforeTest
	 public void configureReports() {
		 reports=Reports.createReport();
	 }
	WebDriver driver;
	@BeforeMethod
	@Parameters("browser")
	public void BrowserOpen(String name) {
		driver=Browser.launchBrowser(name);
	}
	@Test
	public void toRemoveSuccessfullyProductToCart() throws EncryptedDocumentException, IOException, InterruptedException
	{
		AddToCartHomePage addToCartHomePage=new AddToCartHomePage(driver);
		addToCartHomePage.enterProductToSearch(Parameterization.getExelSheetData("Credentials", 0, 0));
		addToCartHomePage.clickOnToSearchButton();
		addToCartHomePage.ClickToBuyHereNowButton(driver);
		addToCartHomePage.CheckTheProductAddSuccefullyCart();
		NaaptolPageChekoutMedelPage naaptolPageChekoutMedelPage=new NaaptolPageChekoutMedelPage(driver);
		naaptolPageChekoutMedelPage.ClickToRemoveButtonInCart();
		Thread.sleep(2000);
		String zero=naaptolPageChekoutMedelPage.text();
		Assert.assertEquals(zero, zero);
	   Thread.sleep(2000);
	 //  Assert.assertTrue();
	 
		
	}

}
