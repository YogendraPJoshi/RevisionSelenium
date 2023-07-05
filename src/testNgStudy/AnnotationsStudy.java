package testNgStudy;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationsStudy {
  
	@BeforeMethod
	public void beforeMethod()
	{
		Reporter.log("Before method is running", true);	
	}
	@AfterMethod
	public void afterMethod()
	{
		Reporter.log("After method is running", true);	

	}
	@BeforeClass
	public void beforeClass()
	{
		Reporter.log("Before class is running", true);	

	}
	@AfterClass
	public void afterClass()
	{
		Reporter.log("afterClass class is running", true);	

	}
	
	@Test
  public void myTest() 
  {
	  Reporter.log("My Test is running", true);
  }
}
