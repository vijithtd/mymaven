package popup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertid {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(1500);
		driver.get("https://skpatro.github.io/demo/links/");
		Thread.sleep(1500);
		String p_id = driver.getWindowHandle();
		System.out.println(p_id);

	}

}
