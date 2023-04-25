package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pass {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/WELCOME/Desktop/webtech/text%20field/Pass&clear.html");
		Thread.sleep(1500);
		driver.findElement(By.tagName("input")).sendKeys("vijith");
		Thread.sleep(1500);
		driver.findElement(By.id("field")).sendKeys("ajith");
		
		
	}

}
