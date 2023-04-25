package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class youtube {

	public static void main(String[] args) throws Throwable {
	
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/WELCOME/Desktop/webtech/text%20field/youtube.html");
		Thread.sleep(1500);
		driver.findElement(By.tagName("input")).sendKeys("hiiiii");
		Thread.sleep(1500);
		driver.findElement(By.id("a1")).sendKeys("hellllo");
		Thread.sleep(1500);
		driver.findElement(By.className("unique")).click();
		Thread.sleep(1500);
		driver.findElement(By.name("YouTube")).click();
		
	
	}

}
