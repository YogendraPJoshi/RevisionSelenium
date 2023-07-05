package testNgStudy;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;



public class dependsOnMethods 
{
  @Test(dependsOnMethods = {"loginToPaytm","booking"})
  public void payment() 
  {
	  Reporter.log("payment is in progress", true);
  }
  
  @Test
  public void booking()
  {
	  Assert.fail();
	  Reporter.log("Booking is in progress", true);
  }
  
  @Test(priority = -1)
  public void loginToPaytm()
  {
	  Assert.fail();
	  Reporter.log("Paytm Login done", true);
  }
}
