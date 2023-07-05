package testNgStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class IsDisplayedUse {
  @Test
  public void fb() 
  {
	  
	  WebDriver driver= new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.facebook.com/login/");
	  WebElement un = driver.findElement(By.name("email"));
	  
//	  if(un.isSelected())
//	  {
//		  System.out.println("TC is passed");
//		  
//	  }
//	  else 
//	  {
//		  System.out.println("TC is failed");
//	}
//	  
	  Assert.assertTrue(un.isSelected(), "UN is not displyed TC failed");
	  
	  
	  
  }
}
