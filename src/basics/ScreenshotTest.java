package basics;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class ScreenshotTest {

	public static void main(String[] args) throws IOException {
		
//		double b=9.12;
//		int a=(int)b;

		WebDriver driver= new ChromeDriver();
		driver.get("https://javagoal.com/");
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String random = RandomString.make(3);
		
		File dest= new File("D:\\Velocity\\Java Class\\9thApr Even\\myScreenShot"+random+".png");
		
		FileHandler.copy(src, dest);

	}

}
