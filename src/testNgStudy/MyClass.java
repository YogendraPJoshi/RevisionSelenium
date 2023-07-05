package testNgStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyClass 
{
  @Test
  public void myTest() 
  {
	  System.out.println("Good evening-->Syso");
	  Reporter.log("Good evening-->reporter w/o boolean con");
	  Reporter.log("Good evening-->reporter with boolean con", false);
  }
}
