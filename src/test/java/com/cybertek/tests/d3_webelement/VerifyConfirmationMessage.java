package com.cybertek.tests.d3_webelement;

import com.cybertek.utilitties.WebDriverfactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VerifyConfirmationMessage {
    public static void main(String[] args) {

        WebDriver driver = WebDriverfactory.getDriver("chrome");
        driver.get("http:/practice.cybertekschool.com/forgot_password");

        //enter Email
        WebElement emailInput = driver.findElement(By.name("email"));

        //send email to the email box of the web site
        String expectedEmail = "qwerty@gmail.com";
        emailInput.sendKeys(expectedEmail);

        //verify that email is displayed in the input box
        //.getAttribute("value") --> get text from the input box
        String actualEmail = emailInput.getAttribute("value");
        if(expectedEmail.equals(actualEmail)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("expectedEmail = " + expectedEmail);
            System.out.println("actualEmail = " + actualEmail);


            //retrieving the password
            WebElement retrievePassword = driver.findElement(By.id("form_submit"));
            retrievePassword.click();

            String expectedMessage = " 'Your email is sent'";
            WebElement messageElement = driver.findElement(By.name("confirmation_message"));
            String actualMessage = messageElement.getText();

            if(expectedMessage.equals(actualMessage)){
                System.out.println("PASS");
            }else{
                System.out.println("FAIL");
                System.out.println("expectedMessage = " + expectedMessage);
                System.out.println("actualMessage = " + actualMessage);
            }

         driver.quit();
        }
    }
}
