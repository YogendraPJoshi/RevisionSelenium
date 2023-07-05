package pom;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NEO1234_ValidateUserName {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException 
	{
		ChromeOptions opt= new ChromeOptions();
		opt.addArguments("--disable-popup-blocking");
		
		WebDriver driver= new ChromeDriver(opt);
		
		driver.manage().window().maximize();
		File myFile= new File("D:\\Velocity\\Java Class\\9thApr Even\\myexcel.xlsx");
		
		Sheet mySheet = WorkbookFactory.create(myFile).getSheet("Sheet2");
		
		driver.get("https://www.neostox.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		
		//1.home
		
		NeoStoxHomePage home= new NeoStoxHomePage(driver);
		
		//home.clickOnSignInButton();
		
		//2.signIn
		NeoStoxSignInPage signIn= new NeoStoxSignInPage(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		signIn.enterMobileNumber(mySheet.getRow(0).getCell(0).getStringCellValue());
	//	signIn.clickOnSignInButton();
		
		//3. Password
		NeoStoxPasswordPage pass= new NeoStoxPasswordPage(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		pass.enterPassword(mySheet.getRow(0).getCell(1).getStringCellValue());
		//pass.clickOnSubmitButton();
		
		//4.tradepanel
		
		NeoStoxTradePanelPage trade= new NeoStoxTradePanelPage(driver);
		
		trade.closePopUp1();
		trade.closePopUp2();
		
		trade.validateUserName(mySheet.getRow(0).getCell(2).getStringCellValue());
		
		trade.logOut();
		
		driver.close();
		
		
		
		
		
		
		
		
		
		

	}

}
