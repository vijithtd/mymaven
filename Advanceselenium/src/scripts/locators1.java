package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators1 {

	public static void main(String[] args) throws Throwable {
		
		
		
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("C:\\Users\\WELCOME\\Desktop\\webtech\\text field\\text field.html");
		Thread.sleep(1500);
	
		driver.findElement(By.tagName("input")).sendKeys("hello");
		Thread.sleep(1500);
		driver.findElement(By.tagName("input")).sendKeys("2023");
		
		
		
		
		
	

	}

}
