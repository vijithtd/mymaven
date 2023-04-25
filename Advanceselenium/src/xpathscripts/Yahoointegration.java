package xpathscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Yahoointegration {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://in.search.yahoo.com/?fr2=inr");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='text' and @title='Sign In' ]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("vijiths81gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='login-signin']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("vijithS@95");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='icon profile']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='ybar-icon-sprite _yb_1brfi _yb_cwd8u']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@role='button']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@role='combobox' and @aria-autocomplete='both' and @id='message-to-field']")).sendKeys("vijiths82@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@data-test-id='compose-subject']")).sendKeys("Regarding of IT Scenarious");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-test-id='rte']")).sendKeys("Dear vijith");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Send']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@role='presentation']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Sign out']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='text' and @title='Sign In' ]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@role='button']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("vijiths82@yahoo.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='login-signin']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("vijithS@95");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='icon profile']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='ybar-icon-sprite _yb_1brfi _yb_cwd8u']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@role='presentation']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Sign out of all']")).click();
		Thread.sleep(1000);
		driver.quit();
		
	}

}
