package javascriptexecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazonjse {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		JavascriptExecutor jse=(JavascriptExecutor)driver;
	
		//pass the data
		driver.get("file:///C:/Users/WELCOME/Desktop/webtech/amazonjse.html");
		jse.executeScript("document.getElementById");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
	

	}

}
