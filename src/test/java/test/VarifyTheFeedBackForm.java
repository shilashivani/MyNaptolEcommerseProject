package test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import pojo.Browser;
import pom.FeedbackFormNaaptol;
import utility.Parameterization;
import utility.Reports;
@Listeners(test.Listeners.class)
public class VarifyTheFeedBackForm {
	 ExtentReports reports;
	 ExtentTest test;
	 @BeforeTest
	 public void configureReports() {
		 reports=Reports.createReport();
	 }
	WebDriver driver;
	@BeforeMethod
	@Parameters("Browser")
	public void openBrowser(String name) {
		driver=Browser.launchBrowser(name);
		
	}
	
	@Test
	public void varifyGeneralFeedbackRadioButton() throws EncryptedDocumentException, IOException, InterruptedException
	{
		FeedbackFormNaaptol feedbackFormNaaptol=new FeedbackFormNaaptol(driver);
		feedbackFormNaaptol.ClickOnFeedbackLink(driver);
		feedbackFormNaaptol.enterFirstNameFieldFeedbackForm(Parameterization.getExelSheetData("Credentials", 0, 1));
		feedbackFormNaaptol.enterlastNameFieldFeedbackForm(Parameterization.getExelSheetData("Credentials", 0, 2));
		feedbackFormNaaptol.enterEmailFieldFeedbackForm(Parameterization.getExelSheetData("Credentials", 0, 3));
		feedbackFormNaaptol.enterPhoneNumberFieldFeedbackForm(Parameterization.getExelSheetData("Credentials", 0, 4));
		feedbackFormNaaptol.selectHowToKnowAboutNaaptol();
		feedbackFormNaaptol.statePurposeOfVisitingNaptol();
		feedbackFormNaaptol.selectHowEazyToKnowAboutnaaptol();
		feedbackFormNaaptol.clickOnStarRating();
		feedbackFormNaaptol.suitableInformationOfProductOffers();
		feedbackFormNaaptol.selectCompareFeaturesDeciderightProduct();
		feedbackFormNaaptol.WhatWeWareLookingForYes();
		feedbackFormNaaptol.offersCompetitiveProductEnought();
		feedbackFormNaaptol.productMakingNaaptolBetterFeedback(Parameterization.getExelSheetData("Credentials", 0, 5));
		feedbackFormNaaptol.clickOnSubmitButton();
	}

}
