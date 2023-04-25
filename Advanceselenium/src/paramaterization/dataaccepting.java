package paramaterization;

import org.testng.annotations.Test;

public class dataaccepting {
	
	@Test(dataProvider = "logindataprovider", dataProviderClass = Dataproviderclass.class)
	public void logintest(String email, String pwd) {
		System.out.println(email+"  "+pwd);
	}

}
