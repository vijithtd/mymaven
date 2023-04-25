package basicframework;

import org.testng.annotations.DataProvider;

public class Dataprovider {
	
	
	@DataProvider(name = "testdataprovider")
	public static String [][] gatData(){
		
	String [][] arr= {{"star","santosh","hiii","helllo","skjkd"}};
	return arr;
	}

}
