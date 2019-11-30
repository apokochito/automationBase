package stepdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Get {



    @Given("^I am working in \"([^\"]*)\" environment$")
    public void iAmWorkingInEnvironment(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^I am targeting \"([^\"]*)\" secured service$")
    public void iAmTargetingSecuredService(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Given("^I need a valid random resource$")
    public void iNeedAValidRandomResource() {
    }

    @And("^The resource path must be updated using uppercase$")
    public void theResourcePathMustBeUpdatedUsingUppercase() {
    }

    @When("^I send a request to retrieve a valid resource$")
    public void iSendARequestToRetrieveAValidResource() {
    }

    @Then("^The response status code should be (\\d+)$")
    public void theResponseStatusCodeShouldBe(int arg0) {
    }

    @And("^The response should be validated$")
    public void theResponseShouldBeValidated() {
    }

    @And("^The resource path must be updated using lowercase$")
    public void theResourcePathMustBeUpdatedUsingLowercase() {
    }

    @Given("^I need a valid random resource with a number value$")
    public void iNeedAValidRandomResourceWithANumberValue() {
    }

    @And("^The resource path must be updated with a number value$")
    public void theResourcePathMustBeUpdatedWithANumberValue() {
    }

    @Given("^I need a valid random resource with two characters$")
    public void iNeedAValidRandomResourceWithTwoCharacters() {
    }

    @And("^The resource path must be updated with two characters$")
    public void theResourcePathMustBeUpdatedWithTwoCharacters() {
    }

    @Given("^I need all resources$")
    public void iNeedAllResources() {
    }

    @And("^The resource path must be updated to get all resources$")
    public void theResourcePathMustBeUpdatedToGetAllResources() {
    }

    @When("^I send a request to retrieve all resources$")
    public void iSendARequestToRetrieveAllResources() {
    }

    @And("^The resource path must be updated using a special character$")
    public void theResourcePathMustBeUpdatedUsingASpecialCharacter() {
    }

    @When("^I send a request to retrieve a response$")
    public void iSendARequestToRetrieveAResponse() {
    }

    @Then("^The response status code should be \"([^\"]*)\"$")
    public void theResponseStatusCodeShouldBe(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^The resource path must be updated using a non exist resource$")
    public void theResourcePathMustBeUpdatedUsingANonExistResource() {
    }

    @And("^The resource path must be updated with a blank space$")
    public void theResourcePathMustBeUpdatedWithABlankSpace() {
    }

    @And("^The resource path must be updated with a long String$")
    public void theResourcePathMustBeUpdatedWithALongString() {
    }

    @And("^The resource path must be updated with two words$")
    public void theResourcePathMustBeUpdatedWithTwoWords() {
    }
}
