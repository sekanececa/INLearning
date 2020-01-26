package main;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropdownMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver= new ChromeDriver();
		driver.get("https://formy-project.herokuapp.com/dropdown");
		
		WebElement dropDownMenu=driver.findElement(By.id("dropdownMenuButton"));
		
		dropDownMenu.click();
		
		WebElement autocompleteItem=driver.findElement(By.id("autocomplete"));
		
		autocompleteItem.click();
		driver.quit();
	}

}
