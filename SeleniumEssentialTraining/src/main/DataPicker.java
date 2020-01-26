package main;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class DataPicker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.get("https://formy-project.herokuapp.com/datepicker");
		
		WebElement dateFiled=driver.findElement(By.id("datepicker"));
		
		dateFiled.sendKeys("03/05/2019");
		
		//pressing ENTER on the Filed
		dateFiled.sendKeys(Keys.RETURN);
		
		driver.quit();
	}

}
