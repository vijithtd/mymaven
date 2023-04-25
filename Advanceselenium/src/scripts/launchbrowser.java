package scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class launchbrowser {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver d=new ChromeDriver();
		//amazon
		d.get("https://www.amazon.com");
		Thread.sleep(5000);
		String t=d.getTitle();
		System.out.println(t);
	
		
		
	}
}



   