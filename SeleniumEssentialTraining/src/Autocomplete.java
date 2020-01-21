import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autocomplete {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://formy-project.herokuapp.com/autocomplete");
		
		WebElement autocomplete=driver.findElement(By.id("autocomplete"));
		autocomplete.sendKeys("1555 Park Blvd, Palo Alto, CA");
		Thread.sleep(40);
		
		WebElement autocompleteResult=driver.findElement(By.className("pac-item"));
		autocompleteResult.click();
		
		driver.quit();
	}
	
	

}
