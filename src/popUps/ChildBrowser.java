package popUps;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowser {

	public static void main(String[] args) {
		
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/browser-windows");
		
		driver.findElement(By.cssSelector("button#windowButton")).click();

		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		Set<String> allWindowId = driver.getWindowHandles();
		
		ArrayList<String>al= new ArrayList<>(allWindowId);
		
		for(String a:al)
		{
			System.out.println(a);
		}
		
		String mainPageId = al.get(0);
		String childPageID = al.get(1);
		
		driver.switchTo().window(childPageID);
		
		driver.manage().window().maximize();
		
		System.out.println("Child page text is "+driver.findElement(By.cssSelector("h1#sampleHeading")).getText());
		
		//driver.close();
		driver.quit();
		
		
	}

}
