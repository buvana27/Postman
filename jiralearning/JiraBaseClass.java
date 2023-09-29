package jiralearning;

import org.testng.annotations.BeforeMethod;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class JiraBaseClass {

	public RequestSpecification input;
	public static Response response;
	public static String issue_id;

	@BeforeMethod
	public void preCondition() {

 RestAssured.baseURI = "https://buvaneshwari-srinivasan.atlassian.net/rest/api/2/issue/";
		
 RestAssured.authentication = RestAssured.preemptive().basic("buvaneshwarisrinivasan@gmail.com",
 "ATATT3xFfGF0B7Oy-yloOhwkzwlYdv5dTLRKtsK66n1OTN-C8B7-5-K5w5zfnMKZgWCdSXkwMvFNINRASrXmbQzVwFjbRo-2LMxVXmDyB_IAqrnmvXW0-4AsVtkM_XYn8jDJZTSfXvxBebNChaJEN6EjXiktka2i9ch0NSdkvUvF4zxym1hpLOA=F5ABC01E");		
	}

}
