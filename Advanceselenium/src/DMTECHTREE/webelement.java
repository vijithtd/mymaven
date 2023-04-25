package DMTECHTREE;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;

public class webelement {

	public static void main(String[] args) throws InterruptedException {
		
		/*  
		 * System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");  //element is present
		 * WebDriver driver=new ChromeDriver(); driver.manage().window().maximize();
		 * driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 * driver.get("https://www.facebook.com/"); 
		 * Thread.sleep(1500); 
		 * WebElement textfield = driver.findElement(By.id("email")); 
		 * if(textfield.isDisplayed()) 
		 * {
		 * textfield.sendKeys("element present"); 
		 * }
		 * 
		 * else { System.out.println("element is not displayed"); }
		 */
		
		/*
		 * System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe"); // element is enabled
		 *  WebDriver driver=new ChromeDriver();
		 * driver.manage().window().maximize();
		 * driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 * driver.get("https://www.facebook.com/"); Thread.sleep(1500); WebElement btn
		 * =driver.findElement(By.xpath("//button[text()='Log in']"));
		 * if(btn.isEnabled()) { btn.click(); } else {
		 * System.out.println("it is disabled"); }
		 */
		 
	
		/*
		 * System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");  // element is selected
		 * WebDriver driver=new ChromeDriver();
		 * driver.manage().window().maximize();
		 * driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); driver.get(
		 * "https://accounts.google.com/signup/v2/webcreateaccount?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&flowName=GlifWebSignIn&flowEntry=SignUp"
		 * ); Thread.sleep(1500); WebElement checkbox =
		 * driver.findElement(By.xpath("//input[contains(@class,'VfPpkd')]"));
		 * checkbox.click(); if(checkbox.isSelected()) {
		 * System.out.println("checkbox is selected"); } else {
		 * System.out.println("checkbox is not selected"); }
		 */
		
		/*
		 * System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe"); // tool tip
		 *  WebDriver driver=new ChromeDriver();
		 * driver.manage().window().maximize();
		 * driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 * driver.get("https://www.facebook.com/"); WebElement kann_lng =
		 * driver.findElement(By.xpath("//a[text()='ಕನ್ನಡ']")); String value =
		 * kann_lng.getAttribute("title"); System.out.println("value");
		 */
		
		/*
		 * System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		 * WebDriver driver = new ChromeDriver(); driver.manage().window().maximize();
		 * driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 * driver.get(" ")
		 */
		
		
		
		
		
		
		
		
	}

}
