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
import utility.Parameterization;
import utility.Reports;
@Listeners(test.Listeners.class)
public class VarifyTheAddToCArtButtonOfNaaptol {
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
		this.driver=Browser.launchBrowser(name);
	}
	@Test
	public void VarifyTheProductToAddSuccefullyInCart() throws EncryptedDocumentException, IOException, InterruptedException
	{
		AddToCartHomePage addToCartHomePage=new AddToCartHomePage(driver);
		addToCartHomePage.moveFocusOnShopingCategory(driver);
		addToCartHomePage.enterProductToSearch(Parameterization.getExelSheetData("Credentials", 0, 0));
		addToCartHomePage.clickOnToSearchButton();
		addToCartHomePage.clickOnToProductHomePage();
		addToCartHomePage.ClickToBuyHereNowButton(driver);
		addToCartHomePage.CheckTheProductAddSuccefullyCart();
		int product=addToCartHomePage.ToatalNumberOfProductsInCarti();
		System.out.println(product);
		Assert.assertTrue(product>0);
	//	addToCartHomePage.clickOnToClickViewButtonOnProduct();
		
	}

}
