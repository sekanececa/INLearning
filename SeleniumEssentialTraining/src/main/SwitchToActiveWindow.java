package main;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;


public class SwitchToActiveWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://formy-project.herokuapp.com/switch-window");
		
		WebElement newTabButton=driver.findElement(By.id("new-tab-button"));
		
		newTabButton.click();
		
		String originalHandle=driver.getWindowHandle();
		
		for(String handle1: driver.getWindowHandles()) {
			driver.switchTo().window(handle1);
		}
		
		driver.switchTo().window(originalHandle);
		driver.quit();
		
	}

}
