package DMTECHTREE;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mousehouraction {

	public static void main(String[] args) throws InterruptedException {
		
		
		/*
		 * System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		 * // mousehour WebDriver driver=new ChromeDriver();
		 * driver.manage().window().maximize();
		 * driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 * driver.get("https://www.flipkart.com/"); Thread.sleep(2000);
		 * driver.findElement(By.xpath("//button[contains(@class, '_2doB4z')]")).click()
		 * ; WebElement electronics =
		 * //driver.findElement(By.xpath("//div[text()='Electronics']"));
		 * driver.findElement(By.xpath("//div[text()='Fashion']")); Actions act=new
		 * Actions(driver); act.moveToElement(electronics).perform();
		 */
		
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		
		
	  
		  
	}

}
