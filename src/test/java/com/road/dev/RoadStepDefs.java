package com.road.dev;

import com.road.dev.pages.LoginPage;
import com.road.dev.pages.WelcomePage;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Ignore;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.assertj.core.api.Assertions.assertThat;


@Ignore
public class RoadStepDefs extends SpringIntegrationTest {

    private WebDriver driver;
    private LoginPage loginPage;
    private WelcomePage welcomePage;

    @Before
    public void initializePageObjects() {
        driver = new ChromeDriver();
        loginPage = new LoginPage(driver, port);
        welcomePage = new WelcomePage(driver);
    }

    @After
    public void shutdownBrowser() {
        driver.quit();
    }

    @Given("^I am on the login page$")
    public void iAmOnTheLoginPage() {
        loginPage.visit();
    }

    @When("^I enter a valid username and password$")
    public void iEnterAValidUsernameAndPassword() {
        loginPage.login("user", "pass");
    }

    @Then("^I should see the welcome page$")
    public void iShouldSeeTheWelcomePage() {
        assertThat(welcomePage.title()).contains("Welcome");
    }

    @When("^I enter an invalid username or password$")
    public void iEnterAnInvalidUsernameOrPassword() {
        loginPage.login("user", "badpass");
    }

    @Then("^I expect to be on the login page$")
    public void iExpectToBeOnTheLoginPage() {
        assertThat(loginPage.title()).contains("Login");
    }

    @And("^I expect to see an error message$")
    public void iExpectToSeeAnErrorMessage() {
        assertThat(loginPage.message()).contains("Incorrect Username/Password");
    }

    @When("^I am missing a username$")
    public void iAmMissingAUsername() {
        loginPage.login("", "pass");
    }

    @And("^I expect to see an missing field error$")
    public void iExpectToSeeAnMissingFieldError() {
        assertThat("Missing Username").isEqualTo(loginPage.message());
    }
}
