package popup;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowminimizemaximize {

	public static void main(String[] args) throws InterruptedException, AWTException {
		
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(1500);
		driver.get("https://www.selenium.dev");
		
		Robot r = new Robot();
		
		r.keyPress(KeyEvent.VK_ALT);
		r.keyPress(KeyEvent.VK_SPACE);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_N);
		
		r.keyRelease(KeyEvent.VK_ALT);
		r.keyRelease(KeyEvent.VK_SPACE);
		r.keyRelease(KeyEvent.VK_N);
		
		Thread.sleep(4000);
		
		driver.manage().window().maximize();
		

	}

}
