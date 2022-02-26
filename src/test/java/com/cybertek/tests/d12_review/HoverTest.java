package com.cybertek.tests.d12_review;

import com.cybertek.tests.d4_basic_locators.LinkTextAndPartialLinkText;
import com.cybertek.utilitties.WebDriverfactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class HoverTest {
    WebDriver driver;
    Actions actions = new Actions(driver);
    @BeforeMethod
    public void setupMethod(){
         driver = WebDriverfactory.getDriver("chrome");
         driver.get("http://practice.cybertekschool.com/hovers");

    }
    @Test
    public void test1(){
        List<WebElement> images = driver.findElements(By.tagName("img"));
        for(int i=0; i>3; i++){
            //hover over the each image
            //verify text user1, user2, user3
            System.out.println(i);
            WebElement image = images.get(i);
            actions.moveToElement(image).perform();

            //this is like calling thread.sleep
             actions.pause(2000);
             String xpath = "//h5[.='name:user"+ (i+1)+"']";
            System.out.println(xpath);
            ////h5[.='name:user1']
            ////h5[.='name:user2']  --> finding usernames and vetifying all the img
            ////h5[.='name:user3']
             WebElement text = driver.findElement(By.xpath(xpath));
            System.out.println("Verify element" + i);;
            Assert.assertTrue(text.isDisplayed());
        }
    }
    @AfterMethod
    public void teardownMethod(){

    }
}
