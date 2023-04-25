package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mousehouraction {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		Thread.sleep(1500);
		WebElement electronics = driver.findElement(By.xpath("//div[text()='Electronics']"));
		Actions act = new Actions(driver);
	    act.moveToElement(electronics).perform();
		Thread.sleep(2000);
		WebElement gaming = driver.findElement(By.xpath("//a[text()='Gaming']"));
		act.moveToElement(gaming).perform();
		driver.findElement(By.xpath("//a[text()='Accessory Kits']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//option[@value='1500'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//option[contains(text(),'₹2500')])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'MORE')]"));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Brand']/../following-sibling::div[1]/div[1]//div[text()='realme']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Discount']/../../preceding-sibling::section[1]/div[2]/div[1]/div[1]/div[1]/label/div[2]")).click();
		
		
		
		
		
		
		
		

	}

}
