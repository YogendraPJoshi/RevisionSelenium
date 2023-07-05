package testNgStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FbLogin {
  @Test(dataProvider = "myFBData", dataProviderClass = FBDataProvider.class)
  public void fb(String fbUn,String fbPass)
  {
	  WebDriver driver= new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.facebook.com/login/");
	  driver.findElement(By.name("email")).sendKeys(fbUn);
	  driver.findElement(By.id("pass")).sendKeys(fbPass); 
  }
}
