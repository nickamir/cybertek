package com.cybertek.tests;

import com.cybertek.utilitties.WebDriverfactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {
    protected WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        driver = WebDriverfactory.getDriver("chrome");

    }

    @AfterMethod
    public void teardownMethod() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}