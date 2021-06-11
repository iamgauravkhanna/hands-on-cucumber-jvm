package step_defs;

import io.cucumber.datatable.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearch {

    @Given("Open Google Home Page")
    public void methodOne() {
        System.out.println("Open Google Home Page");
    }

    @When("Text {string} is entered")
    public void methodTwo(String string) {
        System.out.println("Text " + string + " is entered");
    }

    @When("Text is entered")
    public void methodTwo(DataTable searchText) {
        System.out.println("Text  is entered");
    }


    @Then("results for {string} is shown")
    public void methodThree(String string) {
        System.out.println("results for " + string + " is shown");
    }
}