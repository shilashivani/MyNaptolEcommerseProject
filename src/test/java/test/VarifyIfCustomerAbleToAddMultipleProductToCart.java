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
import com.beust.jcommander.Parameter;

import pojo.Browser;
import pom.MultipleProductToAddCart;
import utility.Parameterization;
import utility.Reports;
@Listeners(test.Listeners.class)
public class VarifyIfCustomerAbleToAddMultipleProductToCart {
	 ExtentReports reports;
	 ExtentTest test;
	 @BeforeTest
	 public void configureReports() {
		 reports=Reports.createReport();
	 }
	WebDriver driver;
	@BeforeMethod
	@Parameters("Browser")
	public void BrowserOpen(String name) {
		driver=Browser.launchBrowser(name);
	}
	@Test
	public void VarifyMultipleProductToAddCart() throws EncryptedDocumentException, IOException, InterruptedException {
		MultipleProductToAddCart multipleProductToAddCart =new MultipleProductToAddCart(driver);
		multipleProductToAddCart.enterProductToSearch(Parameterization.getExelSheetData("Credentials", 0, 0));
		multipleProductToAddCart.clickOnToSearchButton();
		multipleProductToAddCart.clickOnToProductHomePage();;
		multipleProductToAddCart.ClickToBuyHereNowButton(driver);
		multipleProductToAddCart.clickToContinueShoipngButton(driver);

		
	    multipleProductToAddCart.enterProductToSearch(Parameterization.getExelSheetData("Credentials", 2, 0));
	    multipleProductToAddCart.clickOnToSearchButton();
	    Thread.sleep(2000);
	    multipleProductToAddCart.clickOnToProductHomePage();
	    Thread.sleep(2000);
	    multipleProductToAddCart.ClickHareToByNowButtonForSecondProduct(driver);;
	    Thread.sleep(2000);
	    multipleProductToAddCart.clickToContinueShoipngButton(driver);
	    
	    multipleProductToAddCart.enterProductToSearch(Parameterization.getExelSheetData("Credentials", 3, 0));
	    multipleProductToAddCart.clickOnToSearchButton();
	    Thread.sleep(2000);
	    multipleProductToAddCart.clickOnToProductHomePage();
	    Thread.sleep(2000);
	    multipleProductToAddCart.BuyHereToClickButtonForThirdProduct(driver);
	    Thread.sleep(2000);
	    multipleProductToAddCart.clickToContinueShoipngButton(driver);
	   int product= multipleProductToAddCart.VerifyByChekingNumberOfProductShouldInCartGreaterThan1();
	    Assert.assertTrue(product>1);
		
	}
	

}
