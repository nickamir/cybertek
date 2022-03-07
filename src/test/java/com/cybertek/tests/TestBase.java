package com.cybertek.tests;

import com.cybertek.utilitties.ConfigurationReader;
import com.cybertek.utilitties.Driver;
import com.cybertek.utilitties.WebDriverfactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class TestBase {
    protected WebDriver driver;

    protected String url;

    Actions actions;
    @BeforeMethod
    public void setupMethod() {
        driver = Driver.get();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        url = ConfigurationReader.get("url");
        driver.get(url);
        actions = new Actions(driver);
    }

    @AfterMethod
    public void teardownMethod() throws InterruptedException {
        Thread.sleep(3000);
        Driver.closeDriver();
    }
}