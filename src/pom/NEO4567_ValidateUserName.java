package pom;

import java.io.IOException;

import org.checkerframework.checker.units.qual.s;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NEO4567_ValidateUserName extends BaseUsingProperty {
  
	NeoStoxSignInPage signIn;
	NeoStoxHomePage home;
	NeoStoxPasswordPage pass;
	NeoStoxTradePanelPage tp;
	
	
	@BeforeClass
	public void launchBrowser() throws InterruptedException, IOException
	{
		openApplication();
		signIn= new NeoStoxSignInPage(driver);
		home=new NeoStoxHomePage(driver);
		pass= new NeoStoxPasswordPage(driver);
		tp= new NeoStoxTradePanelPage(driver);
	}
	@BeforeMethod
	public void loginToNeoStox() throws IOException, InterruptedException
	{
		home.clickOnSignInButton(driver);
		signIn.enterMobileNumber(UtilityUsingProperty.readDataFromProperty("mobNum"));
		signIn.clickOnSignInButton(driver);
		pass.enterPassword(UtilityUsingProperty.readDataFromProperty("pwd"));
		pass.clickOnSubmitButton(driver);
		tp.closePopUp1();
		tp.closePopUp2();
		
	}

	@Test
  public void validateUserName() throws InterruptedException, IOException
  {
	Assert.assertEquals(tp.getActualUserName(), UtilityUsingProperty.readDataFromProperty("un"),"Actual and Expected UserNames are not matching, TC is Failed");	
  }
	
	@AfterMethod
	public void logOutFromNeoStox() throws InterruptedException
	{
		tp.logOut();
	}
	
	@AfterClass
	public void closeNeoStoxApplication() throws InterruptedException
	{
		closeApplication();
	}
}
