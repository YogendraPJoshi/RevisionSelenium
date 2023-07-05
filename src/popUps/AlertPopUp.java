package popUps;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUp {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
		driver.findElement(By.cssSelector("button#timerAlertButton")).click();
		Thread.sleep(7000);
		Alert alt = driver.switchTo().alert();
		alt.accept();
		
		String myText = driver.findElement(By.cssSelector("div.main-header")).getText();
		System.out.println("text is "+myText);
	
	}

}
