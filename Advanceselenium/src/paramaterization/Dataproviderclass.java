package paramaterization;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataproviderclass {
	
	/*
	 * @Test(dataProvider = "logindataprovider") public void logintest(String email,
	 * String pwd) { System.out.println(email+"  "+pwd); }
	 */
	
	@DataProvider(name = "logindataprovider")
	public String [][] getData()
	{
    String [][]arr= {{"abcd@gmail.com", "asdfg"}, {"ahdsds@gmail.com", "ndkjdka"}, {"a@gmail", "sadjhsdk"}};
    return arr;
	}

}
