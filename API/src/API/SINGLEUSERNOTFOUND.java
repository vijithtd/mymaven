package API;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.internal.http.Status;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class SINGLEUSERNOTFOUND {

	public static void main(String[] args) {
		
		RestAssured.baseURI="https://reqres.in/";
		
		RequestSpecification a =RestAssured.given();
		
		Response res = a.request(Method.GET,"/api/users/23");
		
		
		  System.out.println(res.asString()); int statuscode = res.getStatusCode();
		  System.out.println(statuscode); String statusline = res.getStatusLine();
		  System.out.println(statusline); long time = res.getTime();
		  System.out.println(time);
		 
		
		res.prettyPrint();

	}

}
