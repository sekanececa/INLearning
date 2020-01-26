package main;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.*;

public class ScrollToElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://formy-project.herokuapp.com/scroll");
		
		WebElement name=driver.findElement(By.id("name"));
		
		Actions action=new Actions(driver);
		
		action.moveToElement(name);
		name.sendKeys("Slobodanka Mihajlov");
		
		WebElement date=driver.findElement(By.id("date"));
		date.sendKeys("03/05/2019");
		
		driver.quit();
	}

}
