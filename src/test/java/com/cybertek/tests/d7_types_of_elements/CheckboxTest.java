package com.cybertek.tests.d7_types_of_elements;

import com.cybertek.utilitties.WebDriverfactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckboxTest {

    @Test
    public void test1(){
        WebDriver driver = WebDriverfactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/checkboxes");

        WebElement one = driver.findElement(By.xpath("//input[1]"));
        WebElement two = driver.findElement(By.xpath("//input[2]"));

        System.out.println("one is selected:" + one.isSelected());
        System.out.println("two is selected:" + two.isSelected());

        //verify one is selected
        Assert.assertFalse(one.isSelected());
        //verify two is selected
        Assert.assertTrue(two.isSelected());

        //we are checkiing the first one here
        System.out.println("Check the first one");
        one.click();

        System.out.println("one is selected:" + one.isSelected());
        System.out.println("two is selected:" + two.isSelected());

        //verify one is selected
        Assert.assertTrue(one.isSelected());
        //verify two is selected
        Assert.assertTrue(two.isSelected());

    }


}
