package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class NeoStoxTradePanelPage
{
	
	@FindBy(css = "span#lbl_username") private WebElement userName;
	
	@FindBy(css = "span#lbl_curbalancetop") private WebElement availableBalance;

	@FindBy(xpath = "//span[text()='Logout']") private WebElement logOutButton;
	
	@FindBy(xpath = "(//span[text()='×'])[19]") private WebElement closePopUpButton;
	
	@FindBy(xpath = "(//a[@class='crossbtnmodal'])[2]") private WebElement popUpbutton2;
	
	@FindBy(xpath = "(//span[text()='×'])[36]") private WebElement reNewClose;
	
	public NeoStoxTradePanelPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void validateUserName(String expUN)
	{
		String actUN = userName.getText();
		
		if(expUN.equals(actUN))
		{
			System.out.println("UserNames are Matching TC is Passed");
		}
		else {
			System.out.println("UserNames are not Matching TC is Failed");
		}
		
	}
	
	public void logOut() throws InterruptedException
	{
		userName.click();
		Thread.sleep(1000);
		Reporter.log("Logging out from NeoStox", true);
		logOutButton.click();
	}
	
	public void closePopUp1() throws InterruptedException
	{
		Thread.sleep(1000);
		
		closePopUpButton.click();
		Reporter.log("Handeling popup", true);
	}
	public void closeRenewPopUp(WebDriver driver)
	{
		if(reNewClose.isDisplayed()) 
		{
		reNewClose.click();
		Reporter.log("Handeling renew popup", true);
		driver.navigate().refresh();
		if(reNewClose.isDisplayed())
		{
			reNewClose.click();
		}
		}
		else 
		{
			Reporter.log("no renew popup",true);
		}
	}
	
	public void closePopUp2() throws InterruptedException
	{
		if(popUpbutton2.isDisplayed())
		{
		
		Thread.sleep(1000);
		popUpbutton2.click();
		Reporter.log("Handeling popup", true);
		}
		
	}
	
	
	public String getActualUserName() throws InterruptedException
	{
		Reporter.log("getting actual user name", true);
		Thread.sleep(1000);
		String actUN = userName.getText();
		return actUN;
	}
}
