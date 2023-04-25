package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class textfield {

	public static void main(String[] args) throws InterruptedException  {
		System.out.println("hello");
		
		System.setProperty("webdriver.chrome.driver", "./software/chrome.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("C:\\Users\\WELCOME\\Desktop\\webtech\\text field\\text field.html");
		Thread.sleep(1500);
	    driver.findElement(By.tagName("input")).sendKeys("hello");
	    
		
		
		
		
	}

}
