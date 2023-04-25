package DMTECHTREE;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class takescreenshot {

	private static final FileHandler FileUtils = null;

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//driver.get("https://www.instagram.com/");
		
		// Full page screenshot
		
		/*
		 * TakesScreenshot ts = (TakesScreenshot)driver; // type casting File src =
		 * ts.getScreenshotAs() // outputtype file File dst = new
		 * File("./screenshot/insta.jpeg"); // path of the destination
		 */
		/*
		  try { FileHandler.copy(src, dst); } catch (IOException e) {
		  e.printStackTrace(); }
		 */
		// screenshot of section/portion of the page
		
		//driver.get("https://www.flipkart.com/");
		/*
		 * WebElement section =
		 * driver.findElement(By.xpath("(//div[contains(@class, '_2CIhCB')])[1]"));
		 * 
		 * TakesScreenshot ts = (TakesScreenshot)driver; // type casting File src =
		 * section.getScreenshotAs(OutputType.FILE); // outputtype file File dst = new
		 * File("./screenshot/featured.jpeg"); // path of the destination
		 * 
		 * try { FileHandler.copy(src, dst); } catch (IOException e) { // TODO: handle
		 * exception e.printStackTrace(); } driver.close();
		 */
		driver.get("https://www.flipkart.com/");
		WebElement section = driver.findElement(By.xpath("//div[contains(@class, '_3qX0zy')]"));
		
		TakesScreenshot ts = (TakesScreenshot)driver;     // type casting
		File src = section.getScreenshotAs(OutputType.FILE);   // outputtype file
		File dst = new File("./screenshot/logo.jpeg");  // path of the destination
		
		try {
			FileHandler.copy(src, dst);
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		driver.close();
		
		
	}

}
