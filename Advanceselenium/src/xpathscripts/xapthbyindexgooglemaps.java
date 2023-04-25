package xpathscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xapthbyindexgooglemaps {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/maps/@14.4760642,75.9347108,15z");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='eYqqWd vF7Cdb']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@class='tactile-searchbox-input'])[2]")).sendKeys("Davanagere, Karnataka");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//button[@data-tooltip='Search'])[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@id='section-directions-trip-details-msg-0']")).click();
		Thread.sleep(1000);
		

	}

}
