package pom;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

public class BaseUsingProperty 
{
	
	WebDriver driver;
	public void openApplication() throws InterruptedException, IOException
	{
		driver= new ChromeDriver();
		driver.get(UtilityUsingProperty.readDataFromProperty("url"));
		driver.manage().window().maximize();
		Thread.sleep(1000);
		Reporter.log("Opening browser", true);
	}

	
	public void closeApplication() throws InterruptedException
	{
		
		Reporter.log("Closing browser", true);
		Thread.sleep(1000);
		driver.close();
	}
}
