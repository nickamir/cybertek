package com.cybertek.tests.d12_review;

import com.cybertek.utilitties.WebDriverfactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ExampleClassTest {
   WebDriver driver;
    @BeforeMethod
    public void setupMethod(){
        driver = WebDriverfactory.getDriver("chrome");
        driver.get("https://www.google.com/");
    }
    @Test
    public void test1(){
    //going to google fisrt time
     WebElement input =  driver.findElement(By.name("q"));
     input.sendKeys("iron man"+ Keys.ENTER);
     Assert.assertTrue(driver.findElement(By.id("resultStats")).isDisplayed());
     driver.navigate().back();
     //going to google for the second time
        input =  driver.findElement(By.name("q"));
        input.sendKeys("Thor"+Keys.ENTER);


    }
    @AfterMethod
    public void teardownMethod() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}
