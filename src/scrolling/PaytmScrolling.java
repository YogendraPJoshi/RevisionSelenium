package scrolling;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PaytmScrolling {

	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://paytm.com/recharge");
		
		driver.manage().window().maximize();
		
		WebElement proceedButton = driver.findElement(By.xpath("//button[text()='Proceed to Recharge']"));
		WebElement operatorNames = driver.findElement(By.xpath("//div[text()='Select an Operator']"));
		WebElement investor = driver.findElement(By.xpath("//span[text()='Investor Relations']"));
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		
//		js.executeScript("arguments[0].scrollIntoView(true)", proceedButton);

		CommonClass.scrollIntoView(driver, investor);
		CommonClass.scrollIntoView(driver, proceedButton);
		CommonClass.scrollIntoView(driver, operatorNames);
		
		
		
		
		
	}

}
