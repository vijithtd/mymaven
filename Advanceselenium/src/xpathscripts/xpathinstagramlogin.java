package xpathscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathinstagramlogin {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("9743388487");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("vijithS@95");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[text()='Not Now']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[text()='Not Now']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//div[text()='Messages'])[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@type='button' and text()='Send Message']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("govardhan");
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//div[text()='GOVARDHAN B'])[2]")).click();
		Thread.sleep(5000);
	    driver.findElement(By.xpath("//div[text()='Next']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//textarea[@placeholder='Message...']")).sendKeys("hii");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@type='button' and text()='Send']")).click();
		Thread.sleep(5000);
		
		
		
	
	}

}
