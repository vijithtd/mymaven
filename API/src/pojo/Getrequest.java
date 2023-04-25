package pojo;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Getrequest {

	public static void main(String[] args) {
		
		RestAssured.baseURI="https://reqres.in/";
		 RequestSpecification a = RestAssured.given();
		 Response res = a.request(Method.GET,"/api/users/2");
		 SINGLE_USER single = res.as(SINGLE_USER.class);
		 data data = single.getData();
		 int id = data.getId();
		 System.out.println(id);
		 String fn = data.getFirst_name();
		 System.out.println(fn);
		 String ln = data.getLast_name();
		 System.out.println(ln);
		 String em = data.getEmail();
		 System.out.println(em);
		 
		 
		 support support = single.getSupport();
		
		 String get = support.getText();
		 System.out.println(get);
		 String url = support.getUrl();
		 System.out.println(url);
		 
		 

	}

}
