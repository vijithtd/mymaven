package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class welcometext {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		 WebElement text = driver.findElement(By.xpath("//h2[contains(text(),'Facebook helps you')]"));
		 String text1 = text.getText();
		 System.out.println(text1);
		 
		
		
		
		
		
		

	}

}
