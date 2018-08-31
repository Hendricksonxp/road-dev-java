package com.road.dev.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePageObject {

    private final WebDriver driver;
    String url;

    BasePageObject(final WebDriver driver) {
        this.driver = driver;
    }

    public void visit() {
        if (null != url)
            driver.get(url);
    }

    WebElement find(final By locator) {
        return driver.findElement(locator);
    }


    void click(final By locator) {
        find(locator).click();
    }

    void type(final String inputText, final By locator) {
        find(locator).sendKeys(inputText);
    }

    public String title() {
        return driver.getTitle();
    }


    // THIS IS NOT GOOD - ONLY FOR WORKSHOP
    public void sleep(final Integer seconds) {
        try {
            Thread.sleep(1000 * seconds);
        } catch (final InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }

}
