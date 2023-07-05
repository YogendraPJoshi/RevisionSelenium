package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FbSignUP {
  @Test(dataProvider = "fbData", dataProviderClass = DataProviderTest.class)
  public void fbLogin(String fbUN,String fbPASS) 
  {
	  WebDriver driver= new ChromeDriver();
	  driver.get("https://www.facebook.com/login/");
	  driver.manage().window().maximize();
	  WebElement un = driver.findElement(By.id("email"));
	  un.sendKeys(fbUN);
	  WebElement pass = driver.findElement(By.id("pass"));
	  pass.sendKeys(fbPASS);
  }
}
