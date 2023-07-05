import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeOptionsUse {

	public static void main(String[] args) 
	{
		ChromeOptions opt= new ChromeOptions();
		//opt.addArguments("--start-maximized");
		//opt.addArguments("--incognito");
		//opt.addArguments("--headless");
		ArrayList< String> al= new ArrayList<>();
		al.add("--start-maximized");
		al.add("--incognito");
		opt.addArguments(al);
		WebDriver driver= new ChromeDriver(opt);
		
		driver.get("https://www.naukri.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(7000));
		String mytext = driver.findElement(By.cssSelector("h1.qsb-title")).getText();
	
		System.out.println("text is "+mytext);
	
	}

}
