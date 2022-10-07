package api.automation.test;

import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class TextAssertion {
	
	
	 @Test
	 public void textAssertion()
	 {
		 RestAssured.baseURI ="https://reqres.in";
		 RestAssured
		 .given()
		 .when().get("/api/users/2")
		 
		 .then().log().all()
		 .assertThat()
		 .body("data.email", equalTo("janet.weaver@reqres.in"))
		.and().body("data.first_name", is("Janet")) ;
		 
		 
	 }
	 
	 @Test
	 public void GetReq()
	 {
		 
		 RestAssured.baseURI ="https://rahulshettyacademy.com";
		 RestAssured.given().log().all().queryParam("key", "qaclick").header("Content-Type", "application/json").body("{\\r\\n\" + \r\n"
		 		+ "				\"  \\\"location\\\": {\\r\\n\" + \r\n"
		 		+ "				\"    \\\"lat\\\": -38.383494,\\r\\n\" + \r\n"
		 		+ "				\"    \\\"lng\\\": 33.427362\\r\\n\" + \r\n"
		 		+ "				\"  },\\r\\n\" + \r\n"
		 		+ "				\"  \\\"accuracy\\\": 50,\\r\\n\" + \r\n"
		 		+ "				\"  \\\"name\\\": \\\"Rahul Shetty Academy\\\",\\r\\n\" + \r\n"
		 		+ "				\"  \\\"phone_number\\\": \\\"(+91) 983 893 3937\\\",\\r\\n\" + \r\n"
		 		+ "				\"  \\\"address\\\": \\\"29, side layout, cohen 09\\\",\\r\\n\" + \r\n"
		 		+ "				\"  \\\"types\\\": [\\r\\n\" + \r\n"
		 		+ "				\"    \\\"shoe park\\\",\\r\\n\" + \r\n"
		 		+ "				\"    \\\"shop\\\"\\r\\n\" + \r\n"
		 		+ "				\"  ],\\r\\n\" + \r\n"
		 		+ "				\"  \\\"website\\\": \\\"http://rahulshettyacademy.com\\\",\\r\\n\" + \r\n"
		 		+ "				\"  \\\"language\\\": \\\"French-IN\\\"\\r\\n\" + \r\n"
		 		+ "				\"}").when().post("maps/api/place/add/json").then().assertThat().statusCode(200);
		  
		 
		 
	 }
	 
	 

}
