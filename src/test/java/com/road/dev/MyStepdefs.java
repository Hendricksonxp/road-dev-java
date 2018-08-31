package com.road.dev;

import com.road.dev.pages.LoginPage;
import com.road.dev.pages.WelcomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MyStepdefs {

    private final LoginPage loginPage;
    private final WelcomePage welcomePage;

    public MyStepdefs() {
        loginPage = new LoginPage(Hooks.driver);
        welcomePage = new WelcomePage(Hooks.driver);
    }

    @Given("^I am on the login page$")
    public void iAmOnTheLoginPage() {
        loginPage.visit();
        loginPage.sleep(3);
    }

    @When("^I enter a valid username and password$")
    public void iEnterAValidUsernameAndPassword() {
        loginPage.login("user", "pass");
    }

    @Then("^I should see the welcome page$")
    public void iShouldSeeTheWelcomePage() {
        assertTrue(welcomePage.title().contains("Welcome"));
    }

    @When("^I enter an invalid username or password$")
    public void iEnterAnInvalidUsernameOrPassword() {
        loginPage.login("user", "badpass");
    }

    @Then("^I expect to be on the login page$")
    public void iExpectToBeOnTheLoginPage() {
        assertTrue(loginPage.title().contains("Login"));
    }

    @And("^I expect to see an error message$")
    public void iExpectToSeeAnErrorMessage() {
        assertTrue(loginPage.message().contains("Incorrect Username/Password"));
    }

    @When("^I am missing a username$")
    public void iAmMissingAUsername() {
        loginPage.login("", "pass");
    }

    @And("^I expect to see an missing field error$")
    public void iExpectToSeeAnMissingFieldError() {
        assertEquals("Missing Username", loginPage.message());
    }
}
