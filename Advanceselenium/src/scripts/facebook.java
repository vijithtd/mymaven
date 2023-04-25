package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook {

	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(1500);
		driver.findElement(By.name("email")).sendKeys("vijithkumar TD");
		Thread.sleep(1500);
		driver.findElement(By.name("pass")).sendKeys("vijith@1");
		Thread.sleep(1500);
         driver.findElement(By.name("login")).click();
	}

}
