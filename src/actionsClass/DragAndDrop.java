package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
	WebDriver driver= new ChromeDriver();
		
		driver.get("https://demoqa.com/droppable/");
		
		driver.manage().window().maximize();
		
		WebElement source = driver.findElement(By.cssSelector("div#draggable"));

		WebElement dest = driver.findElement(By.xpath("(//div[@id='droppable'])[1]"));

		Actions act= new Actions(driver);
		
		//act.dragAndDrop(source, dest).perform();
	
	
		act.moveToElement(source).clickAndHold().moveToElement(dest).release().build().perform();
		
		
	}

}
