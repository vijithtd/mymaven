package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class youtube_songsearch {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com/");
		Thread.sleep(2000);
		driver.findElement(By.name("search_query")).sendKeys("shake it pushpavathi");
		Thread.sleep(2000);
		//driver.findElement(By.id("search-icon-legacy")).click();
		//Thread.sleep(3000);
		//driver.findElement(By.linkText("Kranti | Pushpavati Kannada Song | Darshan |V Harikrishna|Shylaja Nag, B Suresha| Media House Studio")).click();
		

	}

}
