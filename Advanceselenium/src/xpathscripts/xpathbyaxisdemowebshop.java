package xpathscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathbyaxisdemowebshop {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("vijiths82@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("vijith@1");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='RememberMe']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='submit' and @value='Log in']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//ul[@class='list']/li[3]/a")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//ul[@class='sublist']/li[2]/a")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Smartphone']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Add your review']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='text' and @class='review-title']")).sendKeys("smartphone");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//textarea[@name='AddProductReview.ReviewText']")).sendKeys("Good Product.");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='AddProductReview.Rating']/../input[4]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@value='Submit review']")).click();
		Thread.sleep(1000);
		

	}

}
