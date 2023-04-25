package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class passandclear {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/WELCOME/Desktop/webtech/text%20field/Pass&clear.html");
		Thread.sleep(1500);
		WebElement first=driver.findElement(By.tagName("input")); first.sendKeys("vijith");
		Thread.sleep(1500);
		first.clear();
		WebElement second=driver.findElement(By.id("field")); second.sendKeys("ajith");
		Thread.sleep(1500);
	    second.clear();
	    Thread.sleep(1500);
	    driver.close();
		

	}

}
