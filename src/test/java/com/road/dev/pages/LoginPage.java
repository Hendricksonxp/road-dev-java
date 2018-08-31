package com.road.dev.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePageObject {

    private final By usernameLocator = By.id("username");
    private final By passwordLocator = By.id("password");
    private final By submitLocator = By.id("submit");
    private final By messageLocator = By.id("message");

    public LoginPage(final WebDriver driver) {
        super(driver);
        url = "http://localhost:8080/login";
    }

    public void login(final String username, final String password) {
        type(username, usernameLocator);
        type(password, passwordLocator);
        click(submitLocator);
    }

    public String message() {
        return find(messageLocator).getText();
    }

}
