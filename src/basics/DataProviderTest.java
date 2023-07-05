package basics;

import org.testng.annotations.DataProvider;

public class DataProviderTest 
{
	@DataProvider(name="fbData")
	
	public static String[][] sendFbData()
	{
		String data[][]= {{"hello","1234"},{"hi","5678"}};
		return data;
	}

}
