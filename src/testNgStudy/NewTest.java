package testNgStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void Z() 
  {
	  Reporter.log("Test Z is running", true);
  }
  @Test
  public void z() 
  {
	  Reporter.log("Test z is running", true);
  }
}
