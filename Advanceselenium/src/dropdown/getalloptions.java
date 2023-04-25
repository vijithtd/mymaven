package dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class getalloptions {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/WELCOME/Desktop/webtech/webelement/dropdown.html");
		driver.manage().window().maximize();
		WebElement d1 = driver.findElement(By.xpath("(//select[@id='city dropdown'])[2]"));
		Select d2 = new Select(d1);
		
	/*	List<WebElement> d3 = d2.getOptions();
		
		
		for(WebElement d4:d3)
		{
			String d5 = d4.getText();
		
			System.out.println(d5);
		}
   */

		
		d2.selectByIndex(0);
		d2.selectByValue("9");
		d2.selectByVisibleText("bengaluru");
		List<WebElement> d3 = d2.getAllSelectedOptions();
		
		for(WebElement d4:d3)
		{
			String d5 = d4.getText();
		
			
			System.out.println(d5);
			
		}
		
		
		
	}

}
