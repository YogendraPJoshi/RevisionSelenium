package basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class My1sCode {

	public static void main(String[] args) 
	{
		WebDriver driver1= new ChromeDriver();
		
		driver1.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C589460569849%7Cb%7Cfacebook%20%27%7C&placement=&creative=589460569849&keyword=facebook%20%27&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696220912%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-327195741349%26loc_physical_ms%3D9062116%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=CjwKCAjwov6hBhBsEiwAvrvN6EaMG6wEIxioRsnJ72Jo1LtwdmcDp5kObdGGfRT_5iORpeV7aAe7HhoCpUMQAvD_BwE");
		
		WebElement month = driver1.findElement(By.cssSelector("select#month"));
		
		Select s= new Select(month);
		
		List<WebElement> monthOptions = s.getOptions();
		for(WebElement mo:monthOptions)
		{
			System.out.println(mo.getText());	
			
		}
		
		for(WebElement mo:monthOptions)
		{
			String actualMonth = mo.getText();
			String expectedMonth="Apr";
			
			if(actualMonth.equals(expectedMonth))
			{
				mo.click();
			}
			
		}
	}

}
