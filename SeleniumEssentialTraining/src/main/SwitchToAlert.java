package main;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToAlert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://formy-project.herokuapp.com/switch-window");
		
		WebElement alertButton=driver.findElement(By.id("alert-button"));
		alertButton.click();
		
		Thread.sleep(400);
		Alert alert=driver.switchTo().alert();
		alert.accept();
		
		driver.quit();
	}

}
