package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C589460569891%7Cb%7Cfb%20sign%20up%7C&placement&creative=589460569891&keyword=fb%20sign%20up&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221832%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-294779041346%26loc_physical_ms%3D9062116%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=CjwKCAjw0ZiiBhBKEiwA4PT9z8-102I3KBlrFN-lC7ZbbzXFwfgmAMmBKvkOzRTOXTUdULf_KbxyTRoCYKYQAvD_BwE");
		
		driver.manage().window().maximize();
		
		Actions act= new Actions(driver);
		
	//	driver.findElement(By.linkText("Already have an account?")).click();
		
		WebElement link = driver.findElement(By.partialLinkText("an account?"));
		
		Thread.sleep(2000);
		
		act.scrollToElement(link).perform();
		
		
		
		
		

	}

}
