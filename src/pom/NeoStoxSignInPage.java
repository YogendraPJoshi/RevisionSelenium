package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class NeoStoxSignInPage
{

	@FindBy(xpath = "(//input[@type='number'])[1]") private WebElement mobileNumberFiled;
	
	@FindBy(id = "lnk_signup1") private WebElement signInButton;
	
	public NeoStoxSignInPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void enterMobileNumber(String mobNum)
	{
		Reporter.log("entering mobile number", true);
		mobileNumberFiled.sendKeys(mobNum);
		
	}
	
	public void clickOnSignInButton(WebDriver driver)
	{
		Reporter.log("clicking on signinButton", false);
		signInButton.click();
		UtilityUsingProperty.implicitWait(driver, 1000);
	}

}
