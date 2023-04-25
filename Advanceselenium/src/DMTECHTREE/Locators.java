package DMTECHTREE;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		
	    //System.setProperty("webdriver.chrome.driver", "./softwares/chrome.driver.exe");
		//WebDriver driver=new ChromeDriver();                                             // to launch the browser
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);                  // time delay
		//driver.manage().window().maximize();                                             // maximize the window 
		//driver.get("https://www.amazon.com");                                           //launch the app
	    //driver.close();                                                                 // close the app
		
		//System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		//WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//driver.get("https://www.amazon.com");
		//String title = driver.getTitle();
		//System.out.println(title);
		
		//System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		//WebDriver driver=new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//driver.manage().window().maximize();
		 //String url = driver.getCurrentUrl();
		 //System.out.println(url);
		
		//System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");           // contains method
		//WebDriver driver=new ChromeDriver();
		//driver.get("https://www.flipkart.com/");
		//driver.manage().window().maximize();
		//Thread.sleep(1500);
		//driver.get("https://www.flipkart.com/");
		//Thread.sleep(1500);
		//driver.findElement(By.xpath("//input[contains(@class, '_2IX_2')]")).sendKeys("9743388487");
		
		/*
		 * System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		 * WebDriver driver=new ChromeDriver(); driver.manage().window().maximize();
		 * driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 * driver.get("https://www.facebook.com/");
		 * driver.findElement(By.id("email")).sendKeys("vijith");                                     //id locator
		 * Thread.sleep(1500); driver.findElement(By.name("pass")).sendKeys("vijith");
		 * //name locator Thread.sleep(6000);
		 * driver.findElement(By.linkText("Forgotten password?")).click();                               // linktext
		 * locator
		 */
		
		
		/*
		 * System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		 * WebDriver driver=new ChromeDriver(); driver.manage().window().maximize();
		 * driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 * driver.get("https://www.google.com/doodles");
		 * driver.findElement(By.partialLinkText("Inter")).click();                                 //partiallinktext
		 * locator Thread.sleep(1500);
		 */
		
		/*
		 * System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		 * WebDriver driver=new ChromeDriver(); driver.manage().window().maximize();
		 * driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 * driver.get("https://www.instagram.com/");
		 * driver.findElement(By.cssSelector("input[type='text']")).sendKeys("vijith");
		 * //css locator Thread.sleep(1500);
		 * driver.findElement(By.cssSelector("input[type='password']")).sendKeys("kumar");      //css locator
		 *  Thread.sleep(1500);
		 */
		
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(1500);
		driver.manage().window().maximize();
		Thread.sleep(1500);
		driver.get("https://www.youtube.com/");
		Thread.sleep(5000);
		//driver.findElement(By.xpath("//input[@type='text']")).sendKeys("malare song");
		driver.findElement(By.name("search_query")).sendKeys("kantara movie song");
		Thread.sleep(2000);
		driver.findElement(By.id("search-icon-legacy")).sendKeys("kantara movie song");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Kantara - Singara Siriye |Vijay Prakash|Ananya Bhat |Ajaneesh Loknath |Rishab Shetty|Hombale Films")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[contains(@aria-label, 'like this video along with')])[1]")).click();
		
		
		
	}

}
