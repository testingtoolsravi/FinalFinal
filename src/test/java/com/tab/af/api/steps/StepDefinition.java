package com.tab.af.api.steps;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItems;
import static org.hamcrest.Matchers.hasSize;

import java.io.IOException;
import java.util.UUID;

import com.tab.af.testbase.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class StepDefinition {
    @Given("load base components")
    public void load_base_components() throws IOException {
	RestAssured.baseURI = (String) TestBase.apiProp.get("base.URI");
    }

    @When("user sends request for get customer types")
    public void user_sends_request_for_get_customer_types() throws IOException {
	RestAssured.basePath = "customer-types";
    }

    @Then("type of customers should be Returned as {string} and {string}")
    public void type_of_customers_should_be_Returned_as_and(String string, String string2) {
	Response res = RestAssured.get();
	res.then().body("displayName", hasItems(string, string2));
	res.then().statusCode(200);
    }

    @When("user sends request for get Occupation types")
    public void user_sends_request_for_get_Occupation_types() {
	RestAssured.basePath = "occupation-types";
    }

    @Then("type of Occupation should be Returned as {string} and {string}")
    public void type_of_Occupation_should_be_Returned_as_and(String string, String string2) {
	Response res = RestAssured.get();
	res.then().body("name", hasItems(string, string2));
	res.then().statusCode(200);
    }

    @When("user sends request for get Income Range types")
    public void user_sends_request_for_get_Income_Range_types() {
	RestAssured.basePath = "income-range-types";
    }

    @Then("type of Income Range should be Returned as {string} and {string}")
    public void type_of_Income_Range_should_be_Returned_as_and(String string, String string2) {
	Response res = RestAssured.get();
	res.then().body("rangeValue", hasItems(string, string2));
	res.then().statusCode(200);
    }

    @When("user sends request for get Nature of Business types")
    public void user_sends_request_for_get_Nature_of_Business_types() {
	RestAssured.basePath = "nature-of-business-types";
    }

    @Then("type of Nature of Business should be Returned as {string} and {string}")
    public void type_of_Nature_of_Business_should_be_Returned_as_and(String string, String string2) {
	Response res = RestAssured.get();
	res.then().body("name", hasItems(string, string2));
	res.then().statusCode(200);
    }

    @When("user sends request for get Product types")
    public void user_sends_request_for_get_Product_types() {
	RestAssured.basePath = "product-types";
    }

    @Then("type of Product should be Returned according to the Query Params productLine as {string}  and custType as {string}")
    public void type_of_Product_should_be_Returned_according_to_the_Query_Params_productLine_as_and_custType_as(
	    String productLine, String custType) {
	Response res = given().queryParams("productLine", productLine).queryParam("custType", custType).get();
	System.out.print(productLine);
	System.out.print(custType);
	res.then().body("", hasSize(5));
    }

    @When("user sends request for get Products")
    public void user_sends_request_for_get_Products() {
	RestAssured.basePath = "products";
    }

    @Then("type of Product should be Returned according to the Query Params custType as {string}")
    public void type_of_Product_should_be_Returned_according_to_the_Query_Params_custType_as(String custType) {
	Response res = given().queryParam("cust_type", custType).get();
	res.then().statusCode(200);
    }

    @When("user sends request payload for primary Applicant for Adding all Basic Info")
    public void user_sends_request_payload_for_primary_Applicant_for_Adding_all_Basic_Info() {
	String applicationId = UUID.randomUUID().toString();
	String requestPayload = "{\"isPrimaryApplicant\":true,\"firstName\":\"David\",\"lastName\":\"Charleson\",\"middleName\":\"C\",\"email\":\"resttest@test.com\",\"citizenship\":\"US Citizen\"}";
	RestAssured.baseURI = "https://muleint.tabbank.com";
	Response res = given().header("content-type", "application/json").body(requestPayload).when()
		.post("/api/exp/onboard/application-groups/" + applicationId + "/applicants").then().assertThat()
		.statusCode(201).and().contentType(ContentType.JSON).and().extract().response();
	// extract applicantId from response, create new applicant object, and assign
	// the id to it.
	String applicantId = res.jsonPath().getString("applicantId");
	given().header("content-Type", "application/json").body("{\"productId\":\"" + applicationId + "\"}").when()
		.post("/api/exp/onboard/application-groups/" + applicationId + "/application-products").then()
		.assertThat().statusCode(201).and().contentType(ContentType.JSON).and()
		.body("applicationProductId", equalTo(applicationId)).extract().response();
	requestPayload = "{\"addressType\":\"PHYSICAL\",\"addr1\":\"107 Pioneer Hill\",\"city\":\"Minot\",\"state\":\"ND\",\"zip\":\"58707\"}";
	res = given().header("content-type", "application/json").body(requestPayload).when()
		.post("/api/exp/onboard/applicants/" + applicationId + "/addresses").then().assertThat().statusCode(201)
		.and().extract().response();
	// Extract addressId from response, get index of applicant the address pertains
	// to, and add the addressId to that.
	String addressId = res.jsonPath().getString("applicantAddressId");
	String requestBody = "{\"number\":\"(651)981-9165\",\"phoneType\":\"MOBILE\"}";
	res = given().param("applicationGroupId", applicationId).when().get("/api/exp/onboard/agreements").then()
		.assertThat().statusCode(200).and().contentType("application/json").extract().response();
	JsonPath agreements = res.jsonPath();
	given().when()
		.post("/api/exp/onboard/finalized-application-group/" + applicationId + "/applicants/" + applicationId)
		.then().assertThat().statusCode(200).and().extract().response();
	String payload = "{\"link_persistent_id\":\"5107e2d3-a37a-428b-85e4-5d295817e0d5\",\"link_version\":\"2.0.255\",\"public_key\":\"51de2acf934f93e36af1f7f67dd473\",\"display_language\":\"\",\"initial_products\":[\"auth\"],\"user\":{}}";
	res = given().header("content-type", "application/json").body(payload).when().post("/link/client/get").then()
		.assertThat().statusCode(200).and().contentType("application/json").extract().response();
	JsonPath fundingClientResponse = res.jsonPath();
	String linkSessionId = fundingClientResponse.getString("link_session_id");
	requestBody = "{\"credentials\":{\"username\":\"user_good\",\"password\":\"pass_good\"},\"flexible_input_responses\":null,\"initial_products\":[\"auth\"],\"institution_id\":\"ins_3\",\"link_open_id\":\"0878abaf-50e8-420d-a2b4-ff3a18a6a730\",\"link_persistent_id\":\"5107e2d3-a37a-428b-85e4-5d295817e0d5\",\"link_session_id\":\""
		+ linkSessionId
		+ "\",\"display_language\":\"en\",\"options\":{},\"public_key\":\"51de2acf934f93e36af1f7f67dd473\"}";
    }

    @When("then finalizes the Application")
    public void then_finalizes_the_Application() {
	// Write code here that turns the phrase above into concrete actions
	// throw new cucumber.api.PendingException();
    }

    @Then("Product should be funded")
    public void product_should_be_funded() {
	// Write code here that turns the phrase above into concrete actions
	// throw new cucumber.api.PendingException();
    }
}
