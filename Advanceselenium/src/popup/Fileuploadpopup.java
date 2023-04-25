package popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fileuploadpopup {

	public static void main(String[] args) throws InterruptedException {
		
		// was to handle file upload popup 
		
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		
		  driver.get("file:///C:/Users/WELCOME/Desktop/webtech/robot/browser.html");
		  driver.manage().window().maximize(); Thread.sleep(2000);
		 
		  driver.findElement(By.id("f1")).sendKeys("C:\\Users\\WELCOME\\Desktop\\qwe.pdf");
		 
	}

}
