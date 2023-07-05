package scrolling;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CommonClass
{
	//driver, element
	public static void scrollIntoView(WebDriver driver,WebElement element) throws InterruptedException
	{
		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", element);
		System.out.println("scrolled into "+element.getText());
			
		
		js.executeScript("window.scrollBy(x,y)");
	}

}
