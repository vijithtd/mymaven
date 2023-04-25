package synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class syncinsta {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver Driver=new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Driver.get("https://www.instagram.com/");
		Driver.findElement(By.name("username")).sendKeys("vijith");
		Driver.findElement(By.name("password")).sendKeys("vijth123");
		Driver.findElement(By.xpath("//button[@type='submit']")).click();

	}

}
