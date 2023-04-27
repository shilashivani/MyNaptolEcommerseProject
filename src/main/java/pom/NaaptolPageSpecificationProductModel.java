package pom;

import java.util.List;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NaaptolPageSpecificationProductModel {
	WebDriver driver;
	@FindBy(xpath="//ul[@id='cartData']")private WebElement cartItems1;
	@FindBy(xpath="//li[@class='head_qty']")private WebElement quantity ;
	@FindBy(xpath="(//a[@href='javascript:autoSuggestion.headerSearch()'])[2]")private WebElement searchButton ;
	@FindBy(xpath="")private WebElement GetPriceText;
	@FindBy(xpath="//a[text()='7 Pcs Induction Friendly Cookware Set + Free Knife Set']")private WebElement getProductDetails;
	@FindBy(xpath="//ul[@class='clearfix']")private List<WebElement> getTotalitems;
	
	//@FindBy(xpath="")private WebElement  ;
	public void NaaptolPageSpecificationProductModel(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void ClickToCartItems()
	{
		cartItems1.click();
	}
	public void GetTotalItems() {
		for(int i=0;i<getTotalitems.size();i++) {
		Dimension allDetails=getTotalitems.get(i).getSize();
		System.out.println(allDetails);
		}
	}
	
	
	

}
