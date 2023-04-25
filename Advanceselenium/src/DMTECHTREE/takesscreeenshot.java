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

public class takesscreeenshot {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		//WebDriver driver=new ChromeDriver();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		
		// Full screenshot
		/*
		 * TakesScreenshot ts = (TakesScreenshot)driver; File src =
		 * ts.getScreenshotAs(OutputType.FILE); File dst = new
		 * File("./screenshot/flip.jpeg");
		 * 
		 * try { FileHandler.copy(src, dst); } catch (IOException e) {
		 * e.printStackTrace(); } driver.close();
		 */
		
		// product screenshot
		/*
		 * driver.get("https://www.flipkart.com/"); WebElement flp =
		 * driver.findElement(By.xpath("//div[contains(@class, '_2GoDe3')]"));
		 * TakesScreenshot ts = (TakesScreenshot)driver; File src =
		 * flp.getScreenshotAs(OutputType.FILE); File dst = new
		 * File("./screenshot/product.jpeg");
		 * 
		 * try { FileHandler.copy(src, dst); } catch (IOException e) {
		 * e.printStackTrace(); } driver.close();
		 */
		
		// without type casting
		
		driver.get("https://www.flipkart.com/");
		WebElement flp = driver.findElement(By.xpath("//div[contains(@class, '_2GoDe3')]"));
		//TakesScreenshot ts = (TakesScreenshot)driver;
		File src = flp.getScreenshotAs(OutputType.FILE);
		File dst = new File("./screenshot/pr.jpeg");
		
		try {
			FileHandler.copy(src, dst);
		} catch (IOException e) {
			e.printStackTrace();
		}
		driver.close();
		
	}

}
