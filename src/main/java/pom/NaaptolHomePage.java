package pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NaaptolHomePage {
	@FindBy(xpath="//a[@id='login-panel-link']")private WebElement loginOrRegistration;
	@FindBy(xpath="//input[@id='registration-basic-panel-mobile']")private WebElement enterMobile;
	@FindBy(xpath="//input[@id='registration-basic-panel-submit']")private WebElement continue1;
	@FindBy(xpath="//input[@id='registration-otp-panel-otp']")private WebElement otp;
	@FindBy(xpath="//input[@id='registration-otp-panel-submit']")private WebElement clicksubmit;
	@FindBy(xpath="//a[text()='Track Order']")private WebElement trackOrder;
	@FindBy(xpath="//div[@id='mainMenuContent']")private WebElement shopingCategary;
	@FindBy(xpath="//input[@id='header_search_text']")private WebElement searchField;
	@FindBy(xpath="(//a[@href='javascript:autoSuggestion.headerSearch()'])[2]")private WebElement searchButton ;
	@FindBy(xpath="//span[text()='(0) Items']")private WebElement carts;
	@FindBy(xpath="//div[@class='grid_Square ']")private List<WebElement> products;
	public NaaptolHomePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public void cickOnLoginOrRegistration() {
		loginOrRegistration.click();
	}
	public void EnterMobileNumberInLogin(String mobileNumber)
	{
		enterMobile.sendKeys(mobileNumber);
	}
	public void clickOnContinueButtonOfLogin() throws InterruptedException
	{
		continue1.click();
		
	}
	
	public void clickOnSubmitOnLogin() throws InterruptedException
	{
		Thread.sleep(20000);
		clicksubmit.click();
	}
	public void clickOnTrackOrder()
	{
		trackOrder.click();
	}
	public void moveFocusOnShopingCategory(WebDriver driver)
	{
		Actions action=new Actions(driver);
		action.moveToElement(shopingCategary);
	}
	public void enterProductToSearch(String products) {
		searchField.sendKeys(products);
	}
	public void clickOnToSearchButton() {
		searchButton.click();
	}
	public void clickOnTocarts()
	{
		carts.click();
	}
	public int getNumberOfProduct() {
		int size=products.size();
		return size;
	}

}
