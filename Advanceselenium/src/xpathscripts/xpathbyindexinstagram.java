package xpathscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathbyindexinstagram {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/maps/@14.4760642,75.9347108,15z");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		

	}

}
