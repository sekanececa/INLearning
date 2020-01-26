package main;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.get("https://formy-project.herokuapp.com/fileupload");

		WebElement fileUploadFiled=driver.findElement(By.id("file-upload-field"));
		
		fileUploadFiled.sendKeys("Seka.docx");
		
		driver.quit();

}
}
