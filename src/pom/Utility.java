package pom;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;

import net.bytebuddy.utility.RandomString;

public class Utility
{
	
	public static String readDataFromExcel(int row,int cell) throws EncryptedDocumentException, IOException
	{
		File myFile= new File("D:\\Velocity\\Java Class\\9thApr Even\\myexcel.xlsx");
		String value = WorkbookFactory.create(myFile).getSheet("Sheet2").getRow(row).getCell(cell).getStringCellValue();
		Reporter.log("reading data from excel", true);
		Reporter.log("received data "+value, true);
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
