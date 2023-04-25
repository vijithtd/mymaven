package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class firstselect {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/WELCOME/Desktop/webtech/webelement/dropdown.html");
		driver.manage().window().maximize();
		WebElement d1 = driver.findElement(By.xpath("(//select[@id='city dropdown'])[2]"));
		Select d2 = new Select(d1);
		
		d2.selectByValue("3");
		
		Thread.sleep(2000);
		d2.selectByIndex(5);
		Thread.sleep(2000);
		WebElement d3 = d2.getFirstSelectedOption();
		String d4 = d3.getText();
		System.out.println(d4);
		
		// select by visible text
		// get option 

	}

}
