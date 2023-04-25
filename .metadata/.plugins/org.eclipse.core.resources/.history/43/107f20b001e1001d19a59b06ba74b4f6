package mymvp;

import org.testng.annotations.Test;

public class Ts extends Baseclass {

	@Test(dataProvider = "flipkart",dataProviderClass = Testdata.class)
	public void login(String name) {
		
		Pomclass sc = new Pomclass(driver);
		sc.search().sendKeys(name);
	}
	

}
