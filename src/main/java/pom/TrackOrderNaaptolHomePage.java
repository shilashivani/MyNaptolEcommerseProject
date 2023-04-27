package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TrackOrderNaaptolHomePage {
	WebDriver driver;
	@FindBy(xpath="//a[text()='Track Order']")private WebElement trackOrder;
	
	public TrackOrderNaaptolHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void clickOnToTrackOrderButton() {
		trackOrder.click();
	}
}
