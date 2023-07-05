package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class NeoStoxHomePage 
{
	
	@FindBy(xpath = "(//a[text()='Sign In'])[1]") private WebElement sigInButton;

	public NeoStoxHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnSignInButton(WebDriver driver)
	{
		
		sigInButton.click();
		Reporter.log("clicking on signInButton", true);
		UtilityUsingProperty.implicitWait(driver, 1000);
	}
	
	
	
	
	
	
	
	
}
