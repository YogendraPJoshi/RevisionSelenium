package pom;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;

import net.bytebuddy.utility.RandomString;

public class UtilityUsingProperty 
{
	
	public static String readDataFromProperty(String key) throws IOException
	{
		Properties prop= new Properties();
		FileInputStream myFile= new FileInputStream("D:\\Yogendra\\RevisionSelenium\\myProperty.properties");
		prop.load(myFile);
		String value = prop.getProperty(key);
		Reporter.log("Reading data from property file "+key,true);
		return value;
	}
	
	public static void implicitWait(WebDriver driver, int waitTime)
	{
		Reporter.log("waiting for "+waitTime+"ms", true);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(waitTime));
	}
	
	public static void takeScreenshotOfTest(WebDriver driver) throws IOException
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String random = RandomString.make(3);
		File dest= new File("D:\\Velocity\\Java Class\\9thApr Even\\myScreenShot"+random+".png");
		FileHandler.copy(src, dest);
		Reporter.log("screenshot taken and saved at "+dest, true);
	
	}
	

}
