package stepdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import domain.GetRequest;
import globalclasses.Base;
import globalclasses.QueriesResponse;
import globalclasses.ResourcePaths;
import globalenums.ColorConsole;
import globalenums.SqlQueries;

import java.util.HashMap;

public class Get {

    public Base baseUtil;
    public QueriesResponse queryResponse;
    public GetRequest requestResource = new GetRequest();

    public Get(Base baseUtil, QueriesResponse queriesResponse) {
        this.baseUtil = baseUtil;
        this.queryResponse = queriesResponse;
    }

    // Environment
    @Given("^I am working in \"([^\"]*)\" environment$")
    public void iAmWorkingInEnvironment(String env) throws Throwable {
        // Give environment to security
        baseUtil.environment = env;
        System.out.println("\n" + ColorConsole.YELLOW + "-- BaseUtil (Set Environment) --\n" + baseUtil.environment + ColorConsole.RESET);
    }

    @And("^I am targeting \"([^\"]*)\" secured service$")
    public void iAmTargetingSecuredService(String api) throws Throwable {
    }

    // Resources from Database
    @Given("^I need a valid random resource$")
    public void iNeedAValidRandomResource() throws Throwable {
        // Consult to the database
        queryResponse.queryResult = new HashMap<>();
        // baseUtil.environment, String.format(SqlQueries.getRandomResource.toString());
        System.out.println("\n" + ColorConsole.YELLOW + "-- QueryResult (Row from Database) --\n" + requestResource + ColorConsole.RESET);
        // Set on the JSON
        requestResource.setResource(queryResponse.queryResult.get("FIELD_OF_DATABASE"));
        System.out.println("\n" + ColorConsole.YELLOW + "-- Random Resource --\n" + requestResource + ColorConsole.RESET);
    }

    @Given("^I need a valid random resource with two characters$")
    public void iNeedAValidRandomResourceWithTwoCharacters() throws Throwable {
        // Consult to the database
        queryResponse.queryResult = new HashMap<>();
        // baseUtil.environment, String.format(SqlQueries.getResourceWithTwoCharacters.toString());
        System.out.println("\n" + ColorConsole.YELLOW + "-- QueryResult (Row from Database) --\n" + requestResource + ColorConsole.RESET);
        // Set on the JSON
        requestResource.setResource(queryResponse.queryResult.get("FIELD_OF_DATABASE"));
        System.out.println("\n" + ColorConsole.YELLOW + "-- Request (Field) --\n" + requestResource + ColorConsole.RESET);
    }

    @Given("^I need a valid random resource with a number value$")
    public void iNeedAValidRandomResourceWithANumberValue() throws Throwable {
        // Consult to the database
        queryResponse.queryResult = new HashMap<>();
        // baseUtil.environment, String.format(SqlQueries.getResourceWithNumberValue.toString());
        System.out.println("\n" + ColorConsole.YELLOW + "-- QueryResult (Row from Database) --\n" + requestResource + ColorConsole.RESET);
        // Set on the JSON
        requestResource.setResource(queryResponse.queryResult.get("FIELD_OF_DATABASE"));
        System.out.println("\n" + ColorConsole.YELLOW + "-- Request (Field) --\n" + requestResource + ColorConsole.RESET);
    }

    @Given("^I need all resources$")
    public void iNeedAllResources() throws Throwable {
        // Consult to the database
        queryResponse.queryResult = new HashMap<>();
        // baseUtil.environment, String.format(SqlQueries.getAllResources.toString());
        System.out.println("\n" + ColorConsole.YELLOW + "-- QueryResult (Row from Database) --\n" + requestResource + ColorConsole.RESET);
        // Set on the JSON
        requestResource.setResource(queryResponse.queryResult.get("FIELD_OF_DATABASE"));
        System.out.println("\n" + ColorConsole.YELLOW + "-- Request (Field) --\n" + requestResource + ColorConsole.RESET);
    }

    /////////////////////////// POSITIVE SCENARIOS ///////////////////////////
    @And("^The resource path must be updated using uppercase$")
    public void theResourcePathMustBeUpdatedUsingUppercase() throws Throwable {
        baseUtil.apiResource = ResourcePaths.API_ROUTE + requestResource.getResource().toUpperCase();
        System.out.println("\n" + ColorConsole.YELLOW + "-- Api Route (resource) --\n" + baseUtil.apiResource + ColorConsole.RESET + "\n");
    }

    @And("^The resource path must be updated using lowercase$")
    public void theResourcePathMustBeUpdatedUsingLowercase() throws Throwable {
        baseUtil.apiResource = ResourcePaths.API_ROUTE + requestResource.getResource().toLowerCase();
        System.out.println("\n" + ColorConsole.YELLOW + "-- Api Route (resource) --\n" + baseUtil.apiResource + ColorConsole.RESET + "\n");
    }

    @And("^The resource path must be updated with a number value$")
    public void theResourcePathMustBeUpdatedWithANumberValue() throws Throwable {
        baseUtil.apiResource = ResourcePaths.API_ROUTE + requestResource.getResource();
        System.out.println("\n" + ColorConsole.YELLOW + "-- Api Route (resource) --\n" + baseUtil.apiResource + ColorConsole.RESET + "\n");
    }

    @And("^The resource path must be updated with two characters$")
    public void theResourcePathMustBeUpdatedWithTwoCharacters() throws Throwable {
        baseUtil.apiResource = ResourcePaths.API_ROUTE + requestResource.getResource();
        System.out.println("\n" + ColorConsole.YELLOW + "-- Api Route (resource) --\n" + baseUtil.apiResource + ColorConsole.RESET + "\n");
    }

    @And("^The resource path must be updated to get all resources$")
    public void theResourcePathMustBeUpdatedToGetAllResources() throws Throwable {
        baseUtil.apiResource = ResourcePaths.API_ROUTE;
        System.out.println("\n" + ColorConsole.YELLOW + "-- Api Route (resource) --\n" + baseUtil.apiResource + ColorConsole.RESET + "\n");
    }

    /////////////////////////// NEGATIVE SCENARIOS ///////////////////////////
    @And("^The resource path must be updated using a special character$")
    public void theResourcePathMustBeUpdatedUsingASpecialCharacter() throws Throwable {
        baseUtil.apiResource = ResourcePaths.API_ROUTE + "$@";
        System.out.println("\n" + ColorConsole.YELLOW + "-- Api Route (resource) --\n" + baseUtil.apiResource + ColorConsole.RESET + "\n");
    }

    @And("^The resource path must be updated using a non exist resource$")
    public void theResourcePathMustBeUpdatedUsingANonExistResource() throws Throwable {
        baseUtil.apiResource = ResourcePaths.API_ROUTE + "A";
        System.out.println("\n" + ColorConsole.YELLOW + "-- Api Route (resource) --\n" + baseUtil.apiResource + ColorConsole.RESET + "\n");
    }

    @And("^The resource path must be updated with a blank space$")
    public void theResourcePathMustBeUpdatedWithABlankSpace() throws Throwable {
        baseUtil.apiResource = ResourcePaths.API_ROUTE + " ";
        System.out.println("\n" + ColorConsole.YELLOW + "-- Api Route (resource) --\n" + baseUtil.apiResource + ColorConsole.RESET + "\n");
    }

    @And("^The resource path must be updated with a long String$")
    public void theResourcePathMustBeUpdatedWithALongString() throws Throwable {
        baseUtil.apiResource = ResourcePaths.API_ROUTE + "thisisasuperlongstring";
        System.out.println("\n" + ColorConsole.YELLOW + "-- Api Route (resource) --\n" + baseUtil.apiResource + ColorConsole.RESET + "\n");
    }

    @And("^The resource path must be updated with two words$")
    public void theResourcePathMustBeUpdatedWithTwoWords() throws Throwable {
        baseUtil.apiResource = ResourcePaths.API_ROUTE + "two words";
        System.out.println("\n" + ColorConsole.YELLOW + "-- Api Route (resource) --\n" + baseUtil.apiResource + ColorConsole.RESET + "\n");
    }

    /////////////////////////// REPETITIVE SCENARIOS ///////////////////////////
    @When("^I send a request to retrieve a valid resource$")
    public void iSendARequestToRetrieveAValidResource() throws Throwable {
        //DBUtils.executeSingleSelect(baseUtil.environment, String.format(SqlQueries.getRandomResource.toString());
        requestResource.setResource("");
    }

    @When("^I send a request to retrieve all resources$")
    public void iSendARequestToRetrieveAllResources() throws Throwable {

    }

    @When("^I send a request to retrieve a response$")
    public void iSendARequestToRetrieveAResponse() throws Throwable {

    }

    @Then("^The response status code should be (\\d+)$")
    public void theResponseStatusCodeShouldBe(int arg0) throws Throwable {

    }

    @And("^The response should be validated$")
    public void theResponseShouldBeValidated() throws Throwable {

    }

    @Then("^The response status code should be \"([^\"]*)\"$")
    public void theResponseStatusCodeShouldBe(String arg0) throws Throwable {

    }

    // Validation
    // JSONObject = myans = new JSONObject(baseUtil.oaResponse.getBody());
    // String tt = JsonTools.findKeys(myResp, "ResourceType");
    // Assert.assertEqueals(resource.getResourceType(), tt);

}
