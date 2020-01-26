package PuttungItAllTogether;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FormPage {
public static void submitForm(WebDriver driver) {
		
		driver.findElement(By.id("first-name")).sendKeys("Jasna");
		driver.findElement(By.id("last-name")).sendKeys("Blazina");
		driver.findElement(By.id("job-title")).sendKeys("QA engineer");
		driver.findElement(By.id("radio-button-1")).click();
		driver.findElement(By.id("checkbox-2")).click();
		driver.findElement(By.cssSelector("option[value='1']")).click();
		//datepicker mora da se zatvori
		driver.findElement(By.id("datepicker")).sendKeys("05/10/2020");
		driver.findElement(By.id("datepicker")).sendKeys(Keys.RETURN);
		
		driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary")).click();
		
	}
	
}
