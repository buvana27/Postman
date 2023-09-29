package jiralearning;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class DeleteIssue extends JiraBaseClass {
	
	@Test(dependsOnMethods="jiralearning.CreateIssue.createIssue")
	
	public void deteleIssue() {
		
		input = RestAssured.given().contentType("application/json");
		
		
	response=input.delete("/"+issue_id);
	
	response.then().assertThat().statusCode(Matchers.equalTo(204));
		
	}

}
