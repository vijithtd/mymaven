package xpathscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathfacebooklogin {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(1500);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("vijithkumar TD");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("vijith@1");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@placeholder='Search Facebook']")).sendKeys("viratkohli");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//strong[text()='virat kohli']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@aria-label='Facebook']")).click();
		Thread.sleep(1000);
		


	}

}
