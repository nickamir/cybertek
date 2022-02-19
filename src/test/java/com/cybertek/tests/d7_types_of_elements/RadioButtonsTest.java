package com.cybertek.tests.d7_types_of_elements;

import com.cybertek.utilitties.WebDriverfactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RadioButtonsTest {

    @Test
    public void test1(){
        WebDriver driver = WebDriverfactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/radio_buttons");

        WebElement blue = driver.findElement(By.id("blue"));
        WebElement red = driver.findElement(By.id("red"));

        System.out.println("is blue selected:" + blue.isSelected());
        System.out.println("is red selected:" + red.isSelected());

        Assert.assertTrue(blue.isSelected());
        Assert.assertFalse(red.isSelected());

        System.out.println("Clicking Red");
        red.click();

        System.out.println("is blue selected:" + blue.isSelected());
        System.out.println("is red selected:" + red.isSelected());

    }
}
