package pom;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NEO7890_ValidateUserName extends Base
{
	NeoStoxHomePage home;
	NeoStoxSignInPage signIn;
	NeoStoxPasswordPage pwd;
	NeoStoxTradePanelPage tp;
	
	@BeforeClass
	public void launchNeoStox() throws InterruptedException
	{
		openApplication();
		home= new NeoStoxHomePage(driver);
		signIn= new NeoStoxSignInPage(driver);
		pwd= new NeoStoxPasswordPage(driver);
		tp= new NeoStoxTradePanelPage(driver);
	}
  
	@BeforeMethod
	public void loginToNeoStox() throws EncryptedDocumentException, IOException, InterruptedException
	{
//		home.clickOnSignInButton();
//		Utility.implicitWait(driver, 1000);
//		signIn.enterMobileNumber(Utility.readDataFromExcel(0, 0));
//		signIn.clickOnSignInButton();
//		Utility.implicitWait(driver, 1000);
//		pwd.enterPassword(Utility.readDataFromExcel(0, 1));
//		pwd.clickOnSubmitButton();
//		Utility.implicitWait(driver, 1000);
//		tp.closePopUp1();
//		tp.closeRenewPopUp(driver);
//		Utility.implicitWait(driver, 1000);
//		tp.closePopUp2();
	}
	
	@Test
  public void validaeUserName() throws EncryptedDocumentException, IOException, InterruptedException
  {
	  String expUN = Utility.readDataFromExcel(0, 2);
	  String actUN = tp.getActualUserName();
	  Assert.assertEquals(expUN, actUN,"UN are not matching TC is Failed");
	  
  }
	
	@AfterMethod
	public void logOutFromNeoStox() throws InterruptedException
	{
		tp.logOut();
		Utility.implicitWait(driver, 2000);
	}
	
	@AfterClass
	public void closeBrowser()
	{
		closeApplication();
	}
}
