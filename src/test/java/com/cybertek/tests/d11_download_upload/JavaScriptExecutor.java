package com.cybertek.tests.d11_download_upload;

import com.cybertek.utilitties.WebDriverfactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class JavaScriptExecutor {
    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        driver = WebDriverfactory.getDriver("chrome");

    }

    @AfterMethod
    public void teardownMethod() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }

    @Test
    public void type(){
        driver.get("http://practice.cybertekschool.com/dynamic_controls");

    }
}
