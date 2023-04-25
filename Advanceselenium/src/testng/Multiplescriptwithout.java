package testng;

import org.testng.annotations.Test;

public class Multiplescriptwithout {
	
	@Test(enabled = false)
	public void test1() {
		System.out.println("mbappe");
	}
	
	@Test
	public void test2() {
		System.out.println("neymar");
	}

}
