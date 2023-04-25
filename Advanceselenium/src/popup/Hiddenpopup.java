package popup;

import java.awt.Window;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hiddenpopup {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//button[text()='Accept All']")).click();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='text' and @placeholder='Optional']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='February']/../following-sibling::span[1]/span[4]/div[4]/span")).click();
		Thread.sleep(2000);

	}

}
