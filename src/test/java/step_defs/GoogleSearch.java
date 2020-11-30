package step_defs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearch {

    @Given("Open Google Home Page")
    public void methodOne() {
        System.out.println("Open Google Home Page");
    }

    @When("Text \"selenium\" is entered")
    public void methodTwo() {
        System.out.println("Text \"selenium\" is entered");
    }

    @Then("results for \"selenium\" is shown")
    public void methodThree() {
        System.out.println("results for \"selenium\" is shown");
    }
}