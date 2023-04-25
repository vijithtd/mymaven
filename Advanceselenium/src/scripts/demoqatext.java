package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demoqatext {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/text-box");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[placeholder='Full Name']")).sendKeys("vijithkumar TD");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[type='email']")).sendKeys("vijiths82@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("textarea[placeholder='Current Address']")).sendKeys(" sriram nagara badavane sog colony davanagere");
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("textarea[id='permanentAddress']")).sendKeys("sriram nagara badavane sog colony davanagere");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[id='submit']")).click();
		Thread.sleep(2000);

	}

}
