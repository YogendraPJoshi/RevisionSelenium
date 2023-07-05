package scrolling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;

public class FluentWait {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://paytm.com/recharge");
		driver.manage().window().maximize();
		
		Wait<WebDriver>w=new org.openqa.selenium.support.ui.FluentWait<WebDriver>(driver).withTimeout(Duration.ofMillis(2000)).pollingEvery(Duration.ofMillis(10)).ignoring(NoSuchElementException.class);

		w.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//button[text()='Proceed to Recharge']"))));
		
		
		
	}

}
