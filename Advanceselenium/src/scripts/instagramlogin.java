package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class instagramlogin {

	public static void main(String[] args) throws InterruptedException {
	
		
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("9743388487");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("vijithS@95");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("button[type='submit']")).click();

	}

}