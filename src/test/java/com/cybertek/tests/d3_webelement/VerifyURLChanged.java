package com.cybertek.tests.d3_webelement;

import com.cybertek.utilitties.WebDriverfactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VerifyURLChanged {
    public static void main(String[] args) {
        //open browser
        WebDriver driver = WebDriverfactory.getDriver("chrome");
        driver.get("http:/practice.cybertekschool.com/forgot_password");

        //openning an Email element and sending email.
        WebElement emailInput = driver.findElement(By.name("email"));
        //sendKeys- enters given text
        emailInput.sendKeys("qwerty@gmail.com");

        //openning a press button element to press Retrieve Password
        WebElement retrievePassword = driver.findElement(By.id("form_submit"));
        retrievePassword.click();

        //verifying URL changed
        String expected = "http://practice.cybertekschool.com/email_sent";
        String actual = driver.getCurrentUrl();

        if(expected.equals(actual)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }


    }
}
