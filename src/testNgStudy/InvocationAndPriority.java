package testNgStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class InvocationAndPriority {
  @Test(priority = -1)
  public void z()
  {
	  
	  Reporter.log("z is running", true);
  }
  @Test(priority = 2)
  public void a()
  {
	  
	  Reporter.log("a is running", true);
  }
  @Test(priority = 1)
  public void c()
  {
	  
	  Reporter.log("c is running", true);
  }
  @Test
  public void b()
  {
	  
	  Reporter.log("b is running", true);
  }
  
  @Test
  public void x()
  {
	  
	  Reporter.log("x is running", true);
  }
  
  @Test
  public void X()
  {
	  
	  Reporter.log("X is running", true);
  }
  
  
  
  
  
}
