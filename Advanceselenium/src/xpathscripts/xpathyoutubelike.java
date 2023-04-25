package xpathscripts;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathyoutubelike {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com/");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("shake it pushpawati song");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//yt-formatted-string[@class='style-scope ytd-video-renderer']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='segmented-like-button']")).click();
		Thread.sleep(100);
		driver.findElement(By.xpath("//div[@id='button']")).click();
		Thread.sleep(100);
		
		
	}

}
