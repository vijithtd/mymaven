package API;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class API {

	public static void main(String[] args) {
		
	
		RestAssured.baseURI="https://reqres.in/";
		
		RequestSpecification a=RestAssured.given();
		Response res=a.request(Method.GET,"/api/users/2");
		res.prettyPrint();
			

		
		
		
	}

}
