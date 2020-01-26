package main;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.get("https://formy-project.herokuapp.com/dragdrop");
		
		WebElement image=driver.findElement(By.id("image"));
		
		WebElement box=driver.findElement(By.id("box"));
		
		Actions actions=new Actions(driver);
		
		
		actions.dragAndDrop(image, box).build().perform();
		
		
		
		
		Thread.sleep(1000);
		driver.quit();
	}

}
