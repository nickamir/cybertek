package com.cybertek.tests.d10_synchronization;

import com.cybertek.utilitties.WebDriverfactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ExplicitWait {
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
    public void testToBeEnabled(){
        driver.get("http://practice.cybertekschool.com/dynamic_controls");

        //click enable
        driver.findElement(By.cssSelector("button[onclick='swapInput()']")).click();

        //find Input field
        WebElement input = driver.findElement(By.cssSelector("input[type='text']"));

        //first line for explicit wait
        WebDriverWait wait = new WebDriverWait(driver, 10);

        //wait for element to be clickable/enabled
        wait.until(ExpectedConditions.elementToBeClickable(input));
        input.sendKeys("Olessya Foxborn");

    }
}
