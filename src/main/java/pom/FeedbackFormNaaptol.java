package pom;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class FeedbackFormNaaptol {
	@FindBy(xpath="//a[text()='Feedback']")private WebElement clickfeedback;
	@FindBy(xpath="//input[@id='generalFeedbackRadio']")private WebElement generalFeedback;
	@FindBy(xpath="")private WebElement orderrelatedFeedback;
	@FindBy(xpath="//input[@id='firstNameFeedback']")private WebElement firstName ;
	@FindBy(xpath="//input[@id='lastNameFeedback']")private WebElement lastName;
	@FindBy(xpath="//input[@id='emailIdFeedback']")private WebElement emailId ;
	@FindBy(xpath="//input[@id='phoneFeedback']")private WebElement phone ;
	@FindBy(xpath="//select[@id='aboutNaaptolId']")private WebElement howToAboutNaptol;
	@FindBy(xpath="//select[@id='purposeShopId']")private WebElement purposeVisitingNaaptol;
	@FindBy(xpath="//select[@id='shoppingExperienceFeedback']")private WebElement shopingexperiece ;
	@FindBy(xpath="//input[@id='otherSource']")private WebElement otherSourse;
	@FindBy(xpath="//img[@id='overallRating4']")private WebElement starRating ;
	@FindBy(xpath="(//input[@value='yes'])[1]")private WebElement productAndItsOfferYes;
	@FindBy(xpath="(//input[@value='No'])[1]")private WebElement productAndItsOfferNo ;
    @FindBy(xpath="//select[@id='compareFeatureId']")private WebElement compareFeatureDesideRight;
	@FindBy(xpath="(//input[@value='yes'])[2]")private WebElement WhatWeWareLooking;
    @FindBy(xpath="(//input[@value='yes'])[3]")private WebElement  OfferseCompetitiveEnough;
    @FindBy(xpath="//textarea[@id='feedback']")private WebElement makingNaaptolBetter;
    @FindBy(xpath="//span[text()=' Submit ']")private WebElement submit;
	public FeedbackFormNaaptol(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void ClickOnFeedbackLink(WebDriver driver) {
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("arguments[0].scrollIntoView(true)",clickfeedback);
		clickfeedback.click();
	}
	public void selectGeneralFeedback()
	{
		generalFeedback.isSelected();
	}
	public void selectOrderRelatedFeedback()
	{
		orderrelatedFeedback.click();
	}
	public void enterFirstNameFieldFeedbackForm(String name)
	{
		firstName.sendKeys(name);
	}
	public void enterlastNameFieldFeedbackForm(String lname) {
		lastName.sendKeys(lname);
	}
	public void enterEmailFieldFeedbackForm(String email) {
		emailId.sendKeys(email);
	}
	public void enterPhoneNumberFieldFeedbackForm(String phonenumber) {
		phone.sendKeys(phonenumber);
	}
	public void selectHowToKnowAboutNaaptol() {
		Select select=new Select(howToAboutNaptol);
		select.selectByVisibleText("Facebook");
		
	}
	public void statePurposeOfVisitingNaptol()
	{
		Select select=new Select(purposeVisitingNaaptol);
		select.selectByVisibleText("Shopping");
		
	}
	public void selectHowEazyToKnowAboutnaaptol() throws InterruptedException
	{
		Select select=new Select(shopingexperiece);
		select.selectByVisibleText("Good");
		Thread.sleep(20000);
	}
	public void clickOnStarRating() {
		starRating.click();
	}
	public void suitableInformationOfProductOffers() {
		productAndItsOfferYes.isSelected();
	}
	public void selectCompareFeaturesDeciderightProduct()
	{
		Select select=new Select(compareFeatureDesideRight);
		select.selectByVisibleText("With great ease");
	}
	public void WhatWeWareLookingForYes() {
		WhatWeWareLooking.isSelected();
	}
	public void offersCompetitiveProductEnought()
	{
		OfferseCompetitiveEnough.click();
	}
	public void productMakingNaaptolBetterFeedback(String feedback)
	{
		makingNaaptolBetter.sendKeys(feedback);
	}
	
	public void clickOnSubmitButton()
	{
		submit.click();
	}
}
