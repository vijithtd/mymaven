package mavin;

import org.json.simple.JSONObject;

import io.restassured.builder.RequestSpecBuilder;

public class get_req {

	public static void main(String[] args) {
		
		
		JSONObject obj = new JSONObject();
		obj.put("name", "morpheus");
		obj.put("job", "leader");
		
		
		RequestSpecBuilder reqbuild = new RequestSpecBuilder();
		RequestSpecBuilder req = reqbuild.setBaseUri("https://reqres.in/");
		
		
		

	}

}
