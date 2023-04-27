package utility;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshot {
	public static void takesceenshot(WebDriver driver,String name)
	{
		String getTime=DateAndTime.getDateAndTime();
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destination=new File("C:\\eclipse workplace\\Naaptol\\Screenshot\\"+getTime+name+".jpg");
		
	}

}
