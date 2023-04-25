package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class bookmyshow {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://in.bookmyshow.com/explore/home/bengaluru");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Varisu']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[text()='Book tickets'])[1]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[text()='Not Now' and @class='No thanks']")).click();
		Thread.sleep(1000);
		
		
	
		
	}

}
