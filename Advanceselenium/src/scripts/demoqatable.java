package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demoqatable {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/webtables");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("span[id='delete-record-1']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("span[id='delete-record-2']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("span[id='delete-record-3']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[id='addNewRecordButton']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[placeholder='First Name']")).sendKeys("vijith");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id='lastName']")).sendKeys("ajith");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id='userEmail']")).sendKeys("basavaraj18ee006@gmail.com");
		Thread.sleep(2000);
	
		
		
	}

}
