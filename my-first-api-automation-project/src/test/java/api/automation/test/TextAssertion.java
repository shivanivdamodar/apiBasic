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
		.and().body("data.first_name", is("Weaver")) ;
		 
		 
	 }
	 

}
