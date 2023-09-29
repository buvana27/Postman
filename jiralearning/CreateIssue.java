package jiralearning;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class CreateIssue extends JiraBaseClass {

	@Test
	public void createIssue() {

		input = RestAssured.given().contentType("application/json").accept("application/json").
				when().body(
				"{\r\n"
				+ "    \"fields\": {\r\n"
				+ "        \"project\": {\r\n"
				+ "            \"key\": \"SEP\"\r\n"
				+ "        },\r\n"
				+ "        \"summary\": \"create issue in RA project\",\r\n"
				+ "        \"description\": \"Creating of an issue using project keys and issue type names using the REST API\",\r\n"
				+ "        \"issuetype\": {\r\n"
				+ "            \"name\": \"Bug\"\r\n"
				+ "        }\r\n"
				+ "    }\r\n"
				+ "}"
						);
		response = input.post();
		response.prettyPrint();
		response.then().assertThat().statusCode(Matchers.equalTo(201));
		issue_id = response.jsonPath().get("id");
		
		
	}

}
