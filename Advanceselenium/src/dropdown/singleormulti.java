package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class singleormulti {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/WELCOME/Desktop/webtech/webelement/dropdown.html");
		driver.manage().window().maximize();
	/*	WebElement d1 = driver.findElement(By.xpath("(//select[@id='city dropdown'])[1]"));
		 Select d2 = new Select(d1);
		 if(d2.isMultiple())
		 {
			d2.selectByIndex(1);
			d2.selectByValue("7");
			d2.selectByVisibleText("davanagere");
		 }
		 else
		 {
			d2.selectByIndex(3); 
		 }
		*/	 
		 
		WebElement d1 = driver.findElement(By.xpath("(//select[@id='city dropdown'])[2]"));
		Select d2 = new Select(d1);
		if(d2.isMultiple())
		{
			d2.selectByIndex(2);
			d2.selectByValue("9");
			d2.selectByVisibleText("davanagere");
			
		} 
	
		 
	}
	

}
