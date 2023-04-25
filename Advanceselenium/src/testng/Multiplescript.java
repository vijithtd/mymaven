package testng;

import org.testng.annotations.Test;

public class Multiplescript {
	
	@Test(invocationCount = 3)
	public void test1() {
		System.out.println("messi");
	}

	@Test
	public void test2() {
		System.out.println("Ronaldo");
	}
}
