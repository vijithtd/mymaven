package popup;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gettitle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(1500);
		driver.get("https://skpatro.github.io/demo/links/");      //p_id
		Thread.sleep(1500);
		driver.findElement(By.name("NewWindow")).click();         //c_id
		Thread.sleep(1500);
		Set<String> all_id = driver.getWindowHandles();           //2 methods
		
		for(String id : all_id)
		{
			driver.switchTo().window(id);
			String title = driver.getTitle();
			System.out.println(title);
			driver.close();
		}

	}

}
