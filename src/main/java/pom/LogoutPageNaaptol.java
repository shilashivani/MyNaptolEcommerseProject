package pom;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPageNaaptol { 
	WebDriver driver;

	@FindBy(xpath="//a[@href='/faces/jsp/components/header/logOut.jsp']")private WebElement logoutbutton;
	
	public LogoutPageNaaptol(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void ClickOntoLogOutButton(WebDriver driver) throws InterruptedException {
	
		
		Set<String> handles=driver.getWindowHandles();
				Iterator<String> i=handles.iterator();
				while(i.hasNext())
				{
					String handle=i.next();
					driver.switchTo().window(handle);
					String title=driver.getTitle();
					if(title.equals("Online Shopping India, Shop Mobile Phone, Mens & Womens Wear, Jewellery, Home Appliances at Naaptol.com"))
							{
						
						     logoutbutton.click();
						     System.out.println("Successfully click");
						
							}
				}
		
	}

}
