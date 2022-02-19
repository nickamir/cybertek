package com.cybertek.tests.d8_Select_List;

import com.cybertek.utilitties.WebDriverfactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class ListOfElementTests {

    @Test
    public void test1() {
        WebDriver driver = WebDriverfactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        List<WebElement> buttons = driver.findElements(By.tagName("buttons"));
        System.out.println(buttons.size());
        Assert.assertEquals(buttons.size(), 6);

        //here we are getting the text of the elements as it is hard to get it when it findElements()
        for (WebElement button: buttons) {
            System.out.println(button.getText());
        }
    }
}
