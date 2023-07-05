package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

public class Base 
{
	WebDriver driver;
	public void openApplication() throws InterruptedException
	{
		driver= new ChromeDriver();
		driver.get("https://neostox.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		Reporter.log("Opening browser", true);
	}
	public void closeApplication()
	{
		Reporter.log("Closing browser", true);
		driver.close();
	}

}
