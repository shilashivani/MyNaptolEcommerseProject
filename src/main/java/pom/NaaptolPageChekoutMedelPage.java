package pom;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NaaptolPageChekoutMedelPage {
	WebDriver driver;
	//@FindBy(xpath="(//a[@onclick='cart.submitOrder()'])[1]")private WebElement chekoutButton;
	//@FindBy(xpath="(//a[@onclick='cart.continueShopping()'])[1]")private WebElement continueShopping;
	
	@FindBy(xpath="//a[@onclick='cart.remove(-2098350432)']")private WebElement remove;
	
	//@FindBy(xpath="//iframe[@id='rufous-sandbox']")private WebElement iframe;
	@FindBy(xpath="(//span[@class='font-bold'])[47] ']")private  WebElement text;
	@FindBy(xpath="//ul[@id='cartData']")private List<WebElement> cartItems1;
	public NaaptolPageChekoutMedelPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void ClickToRemoveButtonInCart() throws InterruptedException {
		
		remove.click();
		Thread.sleep(2000);
	}
	public String text() {
	String text1=text.getText();
	return text1;
	
//	public void RemoveProductShouldBeZero(WebDriver driver) {
//		Set<String> handles=driver.getWindowHandles();
//		Iterator<String> i=handles.iterator();
//		String test=driver.getTitle();
//		while(i.hasNext())
//		{
//			if(test.equals(" Welcome to naaptol :- Search Result for cooker"))
//			{
//				System.out.println("successfuly remove");
//			}
//		
//		//return text1;
//	   }
//		int number0=cartItems1.size();
//		System.out.println(number0);
//		return number0;
		
	
	}

}
