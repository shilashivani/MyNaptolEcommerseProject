package pom;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ProceedToChekOutPageInCart {
	WebDriver driver;
	@FindBy(xpath="(//a[@onclick='cart.submitOrder()'])[1]")private WebElement ProceedTochekButton;
	@FindBy(xpath="//select[@id='fktitle_id']")private WebElement title;
	@FindBy(xpath="//input[@id='firstName']")private WebElement firstName;
	@FindBy(xpath="//input[@id=lastName']")private WebElement lastName ;
	@FindBy(xpath="//textarea[@id='address']")private WebElement completeAddress ;
	@FindBy(xpath="//input[@id='landmark']")private WebElement Landmark;
	@FindBy(xpath="//input[@id='pincode']")private WebElement pincode;
	@FindBy(xpath="//select[@id='state']")private WebElement selectState;
	@FindBy(xpath="//select[@id='city']")private WebElement selectCity ;
	@FindBy(xpath="//input[@id='mobile']")private WebElement mobileNumber ;
	@FindBy(xpath="//input[@id='landline']")private WebElement landlineNumber;
	@FindBy(xpath="//a[@id='addEditButton']")private WebElement saveAndProceed;
	@FindBy(xpath="(//a[@href='javascript:void(0);'])[2]")private WebElement SelectPaymentMethod;
	@FindBy(xpath="//a[@id='shipAddress1']")private WebElement sheepToThidAddressButton;
	@FindBy(xpath="	//input[@id='Cash On Delivery_radiobtn']")private WebElement CashOnDelevary;
	@FindBy(xpath="//a[text()='Click here to Place Order']")private WebElement ClikcHereToPlaceOrder;
	public ProceedToChekOutPageInCart(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void ClcikOnToProceedToChekButton(WebDriver driver) throws InterruptedException {
		ProceedTochekButton.click();
	} 
	public void selectTitleOfMrAndMrsShippingAddressPage() {
		Select select=new Select(title);
		select.selectByValue("value=\"2\"");
	}
	public void enterFirstNameOfShippingAddressPage(String fname) {
		firstName.sendKeys(fname);
		}
	public void enterLastNameOfShippingAddressPage(String lname) {
		lastName.sendKeys(lname);
		}
	public void enterCompleteAdressOfShippingAddressPage(String address) {
		completeAddress.sendKeys(address);
		}
	public void enterLandmarkOfShippingAddressPage(String landmrk) {
		Landmark.sendKeys(landmrk);
		}
	
	public void enterPincodeOfShippingAddressPage(String pin) {
		pincode.sendKeys(pin);
		}
	public void SelectStateShippingAddressPage() {
		Select select=new Select(selectState);
		select.selectByValue("value=\"511\"");
	}
	public void selectCityInShippingAddressPage() {
		Select select=new Select(selectCity);
		select.selectByValue("value=\"AHMEDABAD\"");
	}
	public void enterMobileNumberOfShippingAddressPage(String mobil) {
		mobileNumber.sendKeys(mobil);
		}
	public void enterLandlineOfShippingAddressPage(String landlin) {
		landlineNumber.sendKeys(landlin);
		}
	public void clickOnSaveAndProceedButton() {
		saveAndProceed.click();
	}
	
	public void clickOnthissheepToAddressButton(WebDriver driver) {
		Set<String> handles=driver.getWindowHandles();
		Iterator<String> i=handles.iterator();
		while(i.hasNext()) {
			String handle=i.next();
			driver.switchTo().window(handle);
			String title=driver.getTitle();
			if(title.equals("Online Shopping in India, Shop Online and Compare Price - Compare and Shop Online in India for Mobiles, Laptops, Cameras,Automobiles")) {
				sheepToThidAddressButton.click();
			}
		}
		
	}
//	public void clickOnSelectPaymentMethod() {
//		sheepToThidAddressButton.click();
//	}
	public void  ClickOnCashOnDelevaryRadioButton() {
		CashOnDelevary.isSelected();
	}
	public void clickhereToPlaceOrderButton() {
		ClikcHereToPlaceOrder.click();
	}
	//
//		Set<String> handles=driver.getWindowHandles();
//				Iterator<String> i=handles.iterator();
//				while(i.hasNext())
//				{
//					String handle=i.next();
//					driver.switchTo().window(handle);
//					String title=driver.getTitle();
//					if(title.equals("  Online Shopping in India, Shop Online and Compare Price  - Compare and Shop Online in India for Mobiles, Laptops, Cameras, Automobiles  "))
//							{
//						System.out.println("Successfully click2ProceedTochekButton");
//						
//						
//							}
//				}
		//ProceedTochekButton.click();
	
	
	
		
	

}
