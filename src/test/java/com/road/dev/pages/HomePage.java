package com.road.dev.pages;

import org.openqa.selenium.WebDriver;

public class HomePage extends BasePageObject {

    public HomePage(final WebDriver driver) {
        super(driver);
        url = "http://localhost:8080";
    }
}
