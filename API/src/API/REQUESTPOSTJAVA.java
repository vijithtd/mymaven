package API;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class REQUESTPOSTJAVA {

	public static void main(String[] args) {
		
		
		RestAssured.baseURI="https://reqres.in/";
		
		RequestSpecification a =RestAssured.given();
		
		JSONObject obj=new JSONObject();
		obj.put("name", "morpheus");
		obj.put("job", "leader");
		
		a.contentType(ContentType.JSON);
		a.body(obj.toJSONString());
		
		Response res = a.request(Method.POST,"/api/users");
		
		res.prettyPrint();
		

	}

}
