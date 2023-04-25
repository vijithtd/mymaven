package testng;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class Priority {
	
	@Test(priority = 2)
	public void test1() {
		
		System.out.println("login");
	}
	
	@Test(priority = 1 )
	public void test2() {
		System.out.println("logout");
	}

}
