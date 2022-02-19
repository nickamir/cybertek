package com.cybertek.tests.d8_Select_List;

import com.cybertek.utilitties.WebDriverfactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.*;
import java.util.List;

public class SelectClassTest {

    @Test
    public void PrintAllOptions(){

        WebDriver driver = WebDriverfactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/dropdown");

        //Locate the element with the select tag
        WebElement element = driver.findElement(By.id("state"));
        element.getSize();
        //Create Select object by passing the element from  step 2 as constructor
        Select statetList = new Select(element);

        //getOptions()--> returns all the available options from dropdown list
        List<WebElement> options = statetList.getOptions();
        System.out.println(options.size() );
        for (WebElement option : options) {
            System.out.println(option.getText());
        }

        }
    @Test
    public void selectAndVerifySelected() throws InterruptedException {
        WebDriver driver = WebDriverfactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/dropdown");

        //create Select object
        //1 locate the webelement with the select tag
        //create Select class object by passing the webelemnt as a constructor
        Select stateList = new Select(driver.findElement(By.id("state")));

        //verify that by defaultSelect a State is selected
        //getFirstSelectedOption() --> returns what is currently selected

        String actualSelection = stateList.getFirstSelectedOption().getText();
        System.out.println("actualSelection" + actualSelection);
        Assert.assertEquals(actualSelection, "Select a State");

        Thread.sleep(1000 );
        //Select Using Visisble Text;
        //selectByVisibleText() --> selects using visisble Text
        stateList.selectByVisibleText("Ohio");

        actualSelection = stateList.getFirstSelectedOption().getText();
        Assert.assertEquals(actualSelection, "Ohio");

        Thread.sleep(1000 );
        //Select By Index
        //selectByIndex()-->selects using the index if the option, coint starts from 0.
        stateList.selectByIndex(51);
        actualSelection = stateList.getFirstSelectedOption().getText();
        Assert.assertEquals(actualSelection, "Wyoming");

        Thread.sleep(1000 );
        //select by Value
        //selectByValue("")--> selects by the value of the attribute
        stateList.selectByValue("CA");
        actualSelection = stateList.getFirstSelectedOption().getText();
        Assert.assertEquals(actualSelection, "California");





    }
}
