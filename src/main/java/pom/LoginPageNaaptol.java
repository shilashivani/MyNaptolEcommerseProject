package pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageNaaptol {
	@FindBy(xpath="//a[@id='login-panel-link']")private WebElement loginOrRegistration;
	@FindBy(xpath="//input[@id='registration-basic-panel-mobile']")private WebElement enterMobile;
	@FindBy(xpath="//input[@id='registration-basic-panel-submit']")private WebElement continue1;
	@FindBy(xpath="//input[@id='registration-otp-panel-otp']")private WebElement otp;
	@FindBy(xpath="//input[@id='registration-otp-panel-submit']")private WebElement clicksubmit;
	
	public LoginPageNaaptol(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public void clickOnLoginOrRegistration() {
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
		Thread.sleep(40000);
		clicksubmit.click();
	}
	
}



