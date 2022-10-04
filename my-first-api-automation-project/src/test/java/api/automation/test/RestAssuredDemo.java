package api.automation.test;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class RestAssuredDemo {
	
	
	@Test
	public void getUserDetailsUsingQueryParameter()
	{
		 RestAssured.baseURI ="https://reqres.in";
		 RestAssured.given().param("page", "5")
		 .when().get("/api/users").then().assertThat().statusCode(200);
	}

}
