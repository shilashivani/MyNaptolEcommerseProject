package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountProfileNaaptola {
	@FindBy(xpath="//table//tbody//tr//td[2]")private WebElement emailId;
	@FindBy(xpath="")private WebElement enterMobile;
	@FindBy(xpath="//input[@id='registration-basic-panel-submit']")private WebElement continue1;
	@FindBy(xpath="//input[@id='registration-otp-panel-otp']")private WebElement otp;
	@FindBy(xpath="//input[@id='registration-otp-panel-submit']")private WebElement clicksubmit;
	@FindBy(xpath="//a[text()='Track Order']")private WebElement trackOrder;

}
