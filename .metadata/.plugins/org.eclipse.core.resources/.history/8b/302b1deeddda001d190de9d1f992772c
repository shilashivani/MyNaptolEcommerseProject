package test;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import pojo.Browser;
import pom.NaptolCartPage;
import pom.NaptolHomePage;
import pom.NaptolProductSpecificationPage;
import pom.ProductSearchPage;
import utility.Reports;


@Listeners(test.Listeners.class)
public class NaptolCartTest extends BaseTest {
	ExtentReports reports;
	ExtentTest test;
	
	@BeforeTest
	public void configureReports() {
		reports = Reports.createReports();
	}
	
	@BeforeMethod
	//@Parameters()
	public void openBrowser() {
		driver =Browser.launchBrowser("Chrome");
	}
	
	@Test
	public void addSingleProductToCart() {
		test =reports.createTest("addSingleProductToCart");
		NaptolHomePage naptolHomePage = new NaptolHomePage(driver);
		naptolHomePage.enterProductToSearch("cooker");
		naptolHomePage.clickOnSearchButton();
		
		ProductSearchPage productSearchPage = new ProductSearchPage(driver);
		productSearchPage.selectProduct(0);
		switchToChildWindow(productSearchPage.getProductName(0));
		
		NaptolProductSpecificationPage naptolProductSpecificationPage = new NaptolProductSpecificationPage(driver);
		naptolProductSpecificationPage.ClickOnClickHearToBuyOption();
		
		NaptolCartPage naptolCartPage = new NaptolCartPage(driver);
		naptolCartPage.waitForCatToDisplay(driver);
		Assert.assertEquals(naptolCartPage.getCartItems(), 1);
		
	}
	
	@Test
	public void addSingleProductToCartUsingQuickView() {
		test =reports.createTest("addSingleProductToCartUsingQuickVie");
		NaptolHomePage naptolHomePage = new NaptolHomePage(driver);
		naptolHomePage.enterProductToSearch("cooker");
		naptolHomePage.clickOnSearchButton();
		
		ProductSearchPage productSearchPage = new ProductSearchPage(driver);
		productSearchPage.moveMouseToProduct(driver, 0);
		productSearchPage.clickOnQuickView(0);
		
		NaptolProductSpecificationPage naptolProductSpecificationPage = new NaptolProductSpecificationPage(driver);
		naptolProductSpecificationPage.ClickOnClickHearToBuyOption();
		
		NaptolCartPage naptolCartPage = new NaptolCartPage(driver);
		naptolCartPage.waitForCatToDisplay(driver);
		Assert.assertEquals(naptolCartPage.getCartItems(), 1);
		
		
	}
	
	@Test
	public void removeSingleProductFromCart() throws InterruptedException {
		test =reports.createTest("removeSingleProductFromCart(");
		NaptolHomePage naptolHomePage = new NaptolHomePage(driver);
		naptolHomePage.enterProductToSearch("cooker");
		naptolHomePage.clickOnSearchButton();
		
		ProductSearchPage productSearchPage = new ProductSearchPage(driver);
		productSearchPage.selectProduct(0);
		switchToChildWindow(productSearchPage.getProductName(0));
		
		NaptolProductSpecificationPage naptolProductSpecificationPage = new NaptolProductSpecificationPage(driver);
		naptolProductSpecificationPage.ClickOnClickHearToBuyOption();
		
		NaptolCartPage naptolCartPage = new NaptolCartPage(driver);
		
		naptolCartPage.waitForCatToDisplay(driver);
		naptolCartPage.clickOnRemove(0);
		Thread.sleep(1000);
		Assert.assertEquals(naptolCartPage.getCartItems(), 0);
		
	}
	
	@Test
	public void addMutipleProductToCart() {
		test =reports.createTest("addMutipleProductToCart");
		NaptolHomePage naptolHomePage = new NaptolHomePage(driver);
		naptolHomePage.enterProductToSearch("cooker");
		naptolHomePage.clickOnSearchButton();
		
		ProductSearchPage productSearchPage = new ProductSearchPage(driver);
		productSearchPage.selectProduct(0);
		switchToChildWindow(productSearchPage.getProductName(0));
		
		NaptolProductSpecificationPage naptolProductSpecificationPage = new NaptolProductSpecificationPage(driver);
		naptolProductSpecificationPage.ClickOnClickHearToBuyOption();
		
		NaptolCartPage naptolCartPage = new NaptolCartPage(driver);
		naptolCartPage.waitForCatToDisplay(driver);
		naptolCartPage.ClickOnContinueShoppingOption();
		
		naptolHomePage.enterProductToSearch("cooker");
		naptolHomePage.clickOnSearchButton();
		
		productSearchPage.selectProduct(2);
		switchToChildWindow(productSearchPage.getProductName(2));
		
		naptolProductSpecificationPage.ClickOnClickHearToBuyOption();
		
		naptolCartPage.waitForCatToDisplay(driver);
		Assert.assertEquals(naptolCartPage.getCartItems(), 2);	
	}
	
	@AfterMethod
	public void captureResults(ITestResult result) {
		if(result.getStatus() == ITestResult.SUCCESS)
		{
			test.log(Status.PASS, result.getName());
		}
		else if(result.getStatus() == ITestResult.FAILURE)
		{
			test.log(Status.FAIL, result.getName());
		}
		else if(result.getStatus()== ITes.SKIP) 
		{
			test.log(Status.SKIP, result.getName());
		}
	}
	
	@AfterTest
	public void publishReports() {
		reports.flush();
	}
	
}
