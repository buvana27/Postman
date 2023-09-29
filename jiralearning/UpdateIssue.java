package jiralearning;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class UpdateIssue extends JiraBaseClass {

	
	@Test(dependsOnMethods="jiralearning.CreateIssue.createIssue")
	public void updateIssue() {
		
		System.out.println(issue_id);
		
		input = RestAssured.given().contentType("application/json").accept("application/json").
				when().
				body("{\r\n"
						+ "    \"fields\": {\r\n"
						+ "        \"description\": \"Bug creation Using REST API for testing\"\r\n"
						+ "    }\r\n"
						+ "}");
	response=input.put("/"+issue_id);
	
	response.then().assertThat().statusCode(Matchers.equalTo(204));
	
		
	}
}
