package popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fileupload {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		
		driver.get("C:\\Users\\WELCOME\\Desktop\\webtech\\robot\\browser.html");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		/*
		 * WebElement ele = driver.findElement(By.id("f1")); Thread.sleep(2000);
		 * ele.sendKeys("C:\\Users\\WELCOME\\Desktop\\resume 1.pdf");
		 */
		 
		//driver.findElement(By.id("f1")).sendKeys("C:\\Users\\WELCOME\\Desktop\\resume 1.pdf");
	}

}
