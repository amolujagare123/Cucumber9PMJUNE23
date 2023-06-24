package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SubscribeSD {

    @Given("I am on subscription page")
    public void iAmOnSubscriptionPage() {
        System.out.println("I am on subscription page");
    }

    @And("I click on subscribe button")
    public void iClickOnSubscribeButton() {
        System.out.println(" click on subscribe button");
    }

    @Then("the user should be subscribed")
    public void theUserShouldBeSubscribed() {
        System.out.println("the user should be subscribed");
    }


    @When("^I enter (.+) , (.+) ,(.+)$")
    public void iEnterNameEmailPhNo(String name,String email,String phNo) {

        System.out.println("name="+name);
        System.out.println("email="+email);
        System.out.println("phNo="+phNo);
    }
}
