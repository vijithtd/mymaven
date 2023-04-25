package groups;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class testngbasics {
	
	@Test(groups = {"smoke","regression"})
	public void signup() {
		Reporter.log("create an account", true);
	}
	
	@Test(groups = {"smoke","regression",})
	public void login() {
		Reporter.log("login to account",true);
	}
	@Test(groups = {"system","regression"})
	public void cart() {
		Reporter.log("add items to the cart",true);
	}
	@Test(groups = {"system","regression"})
	public void wishlist() {
		Reporter.log("move to wishlist",true);
	}
	@Test(groups = {"smoke","regression"})
	public void logout() {
		Reporter.log("logged out",true);
	}

}
