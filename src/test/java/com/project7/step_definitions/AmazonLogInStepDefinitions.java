package com.project7.step_definitions;

import com.project7.pages.AmazonLoginPage;
import com.project7.utilities.ConfigurationReader;
import com.project7.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.tr.Ama;

public class AmazonLogInStepDefinitions {

    AmazonLoginPage amazonLoginPage = new AmazonLoginPage();

    @Given("User is on the login page")
    public void user_is_on_the_login_page() {
        String url = ConfigurationReader.getProperty("url.amazon");
        Driver.getDriver().get(url);
    }

    @When("user enters userName")
    public void user_enters_user_name() {


    }

    @When("user enters password")
    public void user_enters_password() {

    }

    @Then("user clicks enter and should be logged in")
    public void user_clicks_enter_and_should_be_logged_in() {

    }


}
