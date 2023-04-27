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
import com.beust.jcommander.Parameter;

import pojo.Browser;
import pom.MultipleProductToAddCart;
import pom.ProceedToChekOutPageInCart;
import utility.Parameterization;
import utility.Reports;
@Listeners(test.Listeners.class)
public class ToVarifyAdressProceedToCkeckOutPage {
	 ExtentReports reports;
	 ExtentTest test;
	 @BeforeTest
	 public void configureReports() {
		 reports=Reports.createReport();
	 }
	WebDriver driver;
	@BeforeMethod
	@Parameters("Browser")                            
	public void OpenBrowser(String name) {
		driver=Browser.launchBrowser(name);
	}
	@Test
	public void ToVarifyAddressProceedToChekOutPage() throws EncryptedDocumentException, IOException {
		MultipleProductToAddCart multipleProductToAddCart =new MultipleProductToAddCart(driver);
		multipleProductToAddCart.enterProductToSearch(Parameterization.getExelSheetData("Credentials", 0, 0));
		multipleProductToAddCart.clickOnToSearchButton();
		multipleProductToAddCart.clickOnToProductHomePage();;
		multipleProductToAddCart.ClickToBuyHereNowButton(driver);
		
		ProceedToChekOutPageInCart proceedToChekOutPageInCart=new ProceedToChekOutPageInCart(driver);
		proceedToChekOutPageInCart.selectTitleOfMrAndMrsShippingAddressPage();
		proceedToChekOutPageInCart.enterFirstNameOfShippingAddressPage(Parameterization.getExelSheetData("Credentials", 0, 0));
		proceedToChekOutPageInCart.enterLastNameOfShippingAddressPage(Parameterization.getExelSheetData("Credentials", 0, 1));
		proceedToChekOutPageInCart.enterCompleteAdressOfShippingAddressPage(Parameterization.getExelSheetData("Credentials", 0, 5));
		proceedToChekOutPageInCart.enterLandmarkOfShippingAddressPage(Parameterization.getExelSheetData("Credentials", 0, 6));
		proceedToChekOutPageInCart.enterPincodeOfShippingAddressPage(Parameterization.getExelSheetData("Credentials", 0, 7));
		proceedToChekOutPageInCart.SelectStateShippingAddressPage();
		proceedToChekOutPageInCart.selectCityInShippingAddressPage();
		proceedToChekOutPageInCart.enterMobileNumberOfShippingAddressPage(Parameterization.getExelSheetData("Credentials", 0, 4));
		//proceedToChekOutPageInCart.enterLandlineOfShippingAddressPage(Parameterization.getExelSheetData("Credentials", 0, 0));
		proceedToChekOutPageInCart.clickOnSaveAndProceedButton();
	//	proceedToChekOutPageInCart.clickOnSelectPaymentMethod();
	}
}

	
