package orderofexecution;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Annotationclass {
	
	@BeforeSuite
	public void bfs() {
		System.out.println("before suite");
	}

	@BeforeTest
	public void bft() {
		System.out.println("before test");
	}
	
	@BeforeClass
	public void bfclass() {
		System.out.println("before class");
	}
	
	@BeforeMethod
	public void bfmethod() {
		System.out.println("before method");
	}
	
	@AfterMethod
	public void afm() {
		System.out.println("after method");
	}
	
	@AfterClass
	public void afc() {
		System.out.println("after class");
	}
	
	@AfterTest
	public void aft() {
		System.out.println("after test");
	}
	
	@AfterSuite
	public void afs() {
		System.out.println("after suite");
	}
}
