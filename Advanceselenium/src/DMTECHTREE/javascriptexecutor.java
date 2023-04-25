package DMTECHTREE;

import java.util.concurrent.TimeUnit;

import javax.swing.text.Document;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascriptexecutor {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		// pass the data and clear the data 
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		//driver.get("file:///C:/Users/WELCOME/Desktop/webtech/amazonjse.html");
		//jse.executeScript("document.getElementById('a1').value='dsfksdfkd'");  // pass the data 
		//jse.executeScript("document.getElementById('a1').value=''");           // clear the data
		
		// scroll down and scroll up 
		
		driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=58355126069&hvpone=&hvptwo=&hvadid=486458706470&hvpos=&hvnetw=g&hvrand=8245055867965875345&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9062064&hvtargid=kwd-10573980&hydadcr=14453_2154373");
		//driver.findElement(By.xpath("driver.findElement(By.xpath(\"//button[contains(@class, '_2doB4z')]\")).click()"));
		for(int i=1; i<3; i++)
		{
			jse.executeScript("window.sc");
		}
		
		
	}

}
