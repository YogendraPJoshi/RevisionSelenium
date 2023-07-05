package testNgStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TimeOutEnabled {
  @Test(timeOut = 1000)
  public void bookBus() throws InterruptedException 
  {
	  Thread.sleep(900);
	  Reporter.log("Booking a bus ticket", true);
  }
  
  @Test(enabled = true)
  public void payment()
  {
	  Reporter.log("Payment is in progress",true);
  }
  
  
}
