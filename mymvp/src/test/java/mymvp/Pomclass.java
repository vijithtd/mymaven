package mymvp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pomclass {

	@FindBy(xpath="/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")
	private WebElement ex;
	
	public Pomclass(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement search() {
		return ex;
	}
	

}
