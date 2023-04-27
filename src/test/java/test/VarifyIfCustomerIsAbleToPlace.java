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
import pom.LoginPageNaaptol;
import pom.ProceedToChekOutPageInCart;
import utility.Parameterization;
import utility.Reports;
@Listeners(test.Listeners.class)
public class VarifyIfCustomerIsAbleToPlace {
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
		loginPageNaaptol.EnterMobileNumberInLogin("8446318675");//(Parameterization.getExelSheetData("Credentials", 3, 3));
		loginPageNaaptol.clickOnContinueButtonOfLogin();
		loginPageNaaptol.clickOnSubmitOnLogin();
	   Assert.assertTrue(true);
	   Thread.sleep(2000);

		AddToCartHomePage addToCartHomePage=new AddToCartHomePage(driver);
		addToCartHomePage.moveFocusOnShopingCategory(driver);
		addToCartHomePage.enterProductToSearch(Parameterization.getExelSheetData("Credentials",- 0, 0));
		addToCartHomePage.clickOnToSearchButton();
		addToCartHomePage.clickOnToProductHomePage();
		addToCartHomePage.ClickToBuyHereNowButton(driver);
		addToCartHomePage.CheckTheProductAddSuccefullyCart();
		Thread.sleep(2000);
		
		ProceedToChekOutPageInCart proceedToChekOutPageInCart=new ProceedToChekOutPageInCart(driver);
		Thread.sleep(2000);
		proceedToChekOutPageInCart.ClcikOnToProceedToChekButton(driver);
		Thread.sleep(2000);
		proceedToChekOutPageInCart.clickOnthissheepToAddressButton(driver);
		Thread.sleep(2000);
		proceedToChekOutPageInCart.clickhereToPlaceOrderButton();
		
		
		
		

		
		
   }

}
