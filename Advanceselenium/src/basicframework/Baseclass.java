package basicframework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Baseclass {
	
	public static WebDriver driver; 
	
	@BeforeMethod
	public void openapp() {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://demowebshop.tricentis.com/");
	}
	
	@AfterMethod
	public void closeapp() {
		driver.quit();
	}

}
