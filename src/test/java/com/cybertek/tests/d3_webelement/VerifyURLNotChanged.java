package com.cybertek.tests.d3_webelement;

import com.cybertek.utilitties.WebDriverfactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 *
 */
public class VerifyURLNotChanged {
    public static void main(String[] args) {

        WebDriver driver = WebDriverfactory.getDriver("chrome");
       //get website
        driver.get("http:/practice.cybertekschool.com/forgot_password");

        //save the expected URL
        String expectedUrl = driver.getCurrentUrl();

        //click on Retirieve password
        WebElement retrievePassword = driver.findElement(By.id("form_submit"));

        retrievePassword.click();

        //verify URL didnt change
        String actualUrl = driver.getCurrentUrl();

        //line of code to run the process
        if (actualUrl.equals(expectedUrl)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }



    }

}
