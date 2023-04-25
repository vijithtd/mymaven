package basicframework;

import org.testng.annotations.Test;

public class Ts_register  extends Baseclass
{
	
	@Test(dataProvider = "testdataprovider", dataProviderClass = Dataprovider.class)
	public static void register(String first, String last, String email, String pass) {
		
	}

}
