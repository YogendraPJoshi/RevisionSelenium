package testNgStudy;

import org.testng.annotations.DataProvider;

public class FBDataProvider 
{
	@DataProvider(name="myFBData")
	public static String[][] sendFbData()
	{
		
		String data[][]= {{"hi","1234"},{"hello","4567"},{"bye","7890"}};
		return data;
		
	}
	
	
	

}
