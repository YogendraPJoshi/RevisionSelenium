package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class NeoStoxPasswordPage 
{
	
	@FindBy (id = "txt_accesspin") private WebElement passwordFiled;
	
	@FindBy(xpath = "//a[text()='Submit']") private WebElement submitButton;
	
	public NeoStoxPasswordPage(WebDriver driver )
	{
		PageFactory.initElements(driver, this);
	}
	
	public void enterPassword(String pwd)
	{
		Reporter.log("Entering password", true);
		passwordFiled.sendKeys(pwd);
	}
	
	public void clickOnSubmitButton(WebDriver driver)
	{
		Reporter.log("Clicking on submit button ", true);
		submitButton.click();
		UtilityUsingProperty.implicitWait(driver, 1000);
	}

}
