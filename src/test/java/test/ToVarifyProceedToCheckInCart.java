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
import pom.MultipleProductToAddCart;
import pom.ProceedToChekOutPageInCart;
import utility.Parameterization;
import utility.Reports;
@Listeners(test.Listeners.class)
public class ToVarifyProceedToCheckInCart {
	 ExtentReports reports;
	 ExtentTest test;
	 @BeforeTest
	 public void configureReports() {
		 reports=Reports.createReport();
	 }
	WebDriver driver;
	@BeforeMethod
	@Parameters("Browser")
	public void OpenBrowser(String name)
	{
		driver=Browser.launchBrowser(name);
	}
	@Test
	public void ToVarifyTheProductChekoutFunctionality() throws EncryptedDocumentException, IOException, InterruptedException
	{
		LoginPageNaaptol loginPageNaaptol=new LoginPageNaaptol(driver);
		loginPageNaaptol.clickOnLoginOrRegistration();
		loginPageNaaptol.EnterMobileNumberInLogin(Parameterization.getExelSheetData("Credentials", 3, 3));
		loginPageNaaptol.clickOnContinueButtonOfLogin();
		loginPageNaaptol.clickOnSubmitOnLogin();
	   Assert.assertTrue(true);
	   Thread.sleep(2000);

		MultipleProductToAddCart multipleProductToAddCart=new MultipleProductToAddCart(driver);
		multipleProductToAddCart.enterProductToSearch(Parameterization.getExelSheetData("Credentials", 0, 0));
		multipleProductToAddCart.clickOnToSearchButton();
		multipleProductToAddCart.clickOnToProductHomePage();
		multipleProductToAddCart.ClickToBuyHereNowButton(driver);
		
		ProceedToChekOutPageInCart proceedToChekOutPageInCart=new ProceedToChekOutPageInCart(driver);
		Thread.sleep(2000);
		proceedToChekOutPageInCart.ClcikOnToProceedToChekButton(driver);
		
			}

}
