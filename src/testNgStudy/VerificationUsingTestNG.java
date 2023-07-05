package testNgStudy;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class VerificationUsingTestNG {
  
	SoftAssert soft= new SoftAssert();// creating object of SoftAssert
	@Test
  public void myTC() 
  {
	  
	  
	  String a="Hi";
	  boolean b=true;
	  
	  soft.assertNull(a, "a is null, TC is failed");
	  Reporter.log("HI GOOD EVENING", true);
	  soft.assertFalse(b, "b value is not true, TC is failed");
	  Reporter.log("HI GOOD bye", true);
	  soft.assertAll();
	  
  }
}
