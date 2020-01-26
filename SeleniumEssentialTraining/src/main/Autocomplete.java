package main;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Autocomplete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://formy-project.herokuapp.com/autocomplete");
		
		//implicit wait
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		
		WebElement autocomplete=driver.findElement(By.id("autocomplete"));
		autocomplete.sendKeys("1555 Park Blvd, Palo Alto, CA");
		//Thread.sleep(40);
		WebDriverWait wait=new WebDriverWait(driver,10);
		WebElement autocompleteResult=wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("pac-item")));
		
		//WebElement autocompleteResult=driver.findElement(By.className("pac-item"));
		autocompleteResult.click();
		
		driver.quit();
	}
	
	

}
