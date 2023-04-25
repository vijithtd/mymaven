package synchronization;

import java.awt.Window;
import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class synchrofacebook {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver Driver=new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Driver.get("https://www.facebook.com/");
		Driver.findElement(By.id("email")).sendKeys("vijith");
		Driver.findElement(By.id("pass")).sendKeys("vijth123");
		Driver.findElement(By.name("login")).click();
		

	}

}
