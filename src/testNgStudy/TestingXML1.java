package testNgStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestingXML1 {
  @Test(groups = "booking")
  public void a() 
  {
	  Reporter.log("a is running", true);
  }
  @Test(groups = "login")
  public void b() 
  {
	  Reporter.log("b is running", true);
  }
  @Test(groups = "booking")
  public void c() 
  {
	  Reporter.log("c is running", true);
  }
}
