package main;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobuttons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver= new ChromeDriver();
		driver.get("https://formy-project.herokuapp.com/radiobutton");
		
		WebElement radioButton1=driver.findElement(By.id("radio-button-1"));
		
		radioButton1.click();
		
		WebElement radioButton2=driver.findElement(By.cssSelector("input[value='option2']"));
		
		radioButton2.click();
		
		WebElement radioButton3=driver.findElement(By.xpath("//input[contains(@value,'option3')]"));
		
		radioButton3.click();
		
		driver.quit();
	}

}
