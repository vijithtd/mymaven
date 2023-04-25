package xpathscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathtwitter {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://twitter.com/i/flow/login?input_flow_data=%7B%22requested_variant%22%3A%22eyJsYW5nIjoiZW4ifQ%3D%3D%22%7D");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='text' and @autocomplete='username']")).sendKeys("vijiths82@gmail.com");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@inputmode='text']")).sendKeys("vijiths82@gmail.com");
		Thread.sleep(5000);

	}

}
