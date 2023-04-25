package popup;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertallid {

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
		int count = all_id.size();                                //size
		System.out.println(count);                                //2
		
		
		/*
		 * for(String o:all_id) //for each loop { System.out.println(o); }
		 */
		

	}

}
