package com.cybertek.tests.d11_download_upload;

import com.cybertek.utilitties.WebDriverfactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ActionsExamplesTest {
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
    public void hoverTest() throws InterruptedException {
        driver.get("http://practice.cybertekschool.com/hovers");

        WebElement img1 = driver.findElement(By.tagName("img"));

        //Actions --> class that contains all the user interactions
        Actions actions = new Actions(driver);
        Thread.sleep(3000);
        //moveToElement() --> moves the mouse on top of the given element
        //perform() --> performs the action
        actions.moveToElement(img1).perform();

        //checking if its true
        Assert.assertTrue(driver.findElement(By.linkText("View profile")).isDisplayed());

    }
}
