package xpathscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class relativexpathshaadiregister {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@class='ico-register']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='gender-male']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("vijithkumar");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("TD");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("vijiths82@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("vijith@1");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("vijith@1");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='register-button']")).click();
		Thread.sleep(1000);

		
	
		
		
	}

}
