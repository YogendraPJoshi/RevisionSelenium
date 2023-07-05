package testNgStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestingXML2 {
  @Test(groups = "booking")
  public void d() 
  {
	  Reporter.log("d is running", true);
  }
  @Test(groups = "login")
  public void e() 
  {
	  Reporter.log("e is running", true);
  }
  @Test(groups = "booking")
  public void f() 
  {
	  Reporter.log("f is running", true);
  }
}
