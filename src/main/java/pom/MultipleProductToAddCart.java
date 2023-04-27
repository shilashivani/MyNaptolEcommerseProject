package pom;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MultipleProductToAddCart {
	WebDriver driver;
	@FindBy(xpath="//div[@id='mainMenuContent']")private WebElement shopingCategary;
	@FindBy(xpath="//input[@id='header_search_text']")private WebElement searchField;
	@FindBy(xpath="(//a[@href='javascript:autoSuggestion.headerSearch()'])[2]")private WebElement searchButton ;
	@FindBy(xpath="//div[@id='productItem1']")private WebElement product ;
	@FindBy(xpath="//div[@id='productItem1']")private WebElement clickOnproduct ;
	@FindBy(xpath="//a[@id='cart-panel-button-0']")private WebElement clickHereToBuy ;
	@FindBy(xpath="(//a[@id='cart-panel-link'])[2]")private WebElement clickHeretoCartButton ;
	@FindBy(xpath="//ul[@id='cartData']")private List<WebElement> cartItems1;
	@FindBy(xpath="(//a[text()=' « Continue Shopping '])[1]")private WebElement continueshoping;
	
	
	
	@FindBy(xpath="//section[@id='quickViewBox']")private WebElement clickOnClickView ;
	
	@FindBy(xpath="")private WebElement addToCart ;
	@FindBy(xpath="//span[text()='(0) Items']")private WebElement carts;
	public MultipleProductToAddCart(WebDriver driver) {
		PageFactory.initElements(driver, this);
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
	public void clickOnToProductHomePage() {
		clickOnproduct.click();
		
	}
	public void ClickToBuyHereNowButton(WebDriver driver) {
		
		
		Set<String> handles=driver.getWindowHandles();
				Iterator<String> i=handles.iterator();
				while(i.hasNext())
				{
					String handle=i.next();
					driver.switchTo().window(handle);
					String title=driver.getTitle();
					if(title.equals("Buy 7 Pcs Induction Friendly Cookware Set + Free Knife Set Online at Best Price in India on Naaptol.com"))
							{
						      clickHereToBuy.click();
						  System.out.println("Successfully click");
						
							}
				}
	}
				
	public void CheckTheProductAddSuccefullyCart() throws InterruptedException  {
		
		clickHeretoCartButton.click();
		
	}
	
	public void clickToContinueShoipngButton(WebDriver driver) throws InterruptedException
	{
		Thread.sleep(2000);
		System.out.println("happy");
		continueshoping.click();
	
		
		driver.switchTo().parentFrame();
		System.out.println("I am Going to immigiat Parent");
	}

public void ClickHareToByNowButtonForSecondProduct( WebDriver driver) {	
	//String parent=driver.getWindowHandle();
    //driver.switchTo().window(parent);

		//String parent=driver.getWindowHandle();
		Set<String> handles=driver.getWindowHandles();
				Iterator<String> i=handles.iterator();
				while(i.hasNext())
				{
					String handle=i.next();
					driver.switchTo().window(handle);
					String title=driver.getTitle();
					if(title.equals("Buy Electric Egg Cooker Online at Best Price in India on Naaptol.com"))
							{
						      clickHereToBuy.click();
						 //   System.out.println("Successfully click");
						
							}
				}
}
public void BuyHereToClickButtonForThirdProduct(WebDriver driver) {
	
	Set<String> handles=driver.getWindowHandles();
     Iterator<String> i=handles.iterator();
     while(i.hasNext())
     {
    	 String handle=i.next();
    	 driver.switchTo().window(handle);
    	 String title=driver.getTitle();
    	 if(title.equals("Buy 20 Pcs Copper Bottom Multipurpose Cook & Serve Set Online at Best Price in India on Naaptol.com"))
    	 {
    		 clickHereToBuy.click();
    		  System.out.println("Getting Third product");
				
			
    	 }
     }
	
}
public int VerifyByChekingNumberOfProductShouldInCartGreaterThan1() {
	int size=cartItems1.size();
	
	System.out.println(size);
	return size;
}
}
		
		//driver.switchTo().window(parent);
	
		

	
//	public int ToatalNumberOfProductsInCarti()  {
//
//		
//		int size=cartItems1.size();
//		size++;
//		return size;
//		
//	}


