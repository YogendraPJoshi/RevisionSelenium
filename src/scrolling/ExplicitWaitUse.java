package scrolling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitUse {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://paytm.com/recharge");
		driver.manage().window().maximize();

		WebDriverWait wait= new WebDriverWait(driver, Duration.ofMillis(2000));
	
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//button[text()='Proceed to Recharge']"))));
	
	
	}

}
