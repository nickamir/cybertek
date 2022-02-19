package com.cybertek.tests.d4_basic_locators;

import com.cybertek.utilitties.WebDriverfactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NameLocatorTest {
    public static void main(String[] args) {
        WebDriver driver = WebDriverfactory.getDriver("chrome");
        driver.manage().window().maximize();//this line of code is to make the screen full when we go there

        driver.get("http://practice.cybertekschool.com/sign_up");

        WebElement fullName = driver.findElement(By.name("full_name"));
        fullName.sendKeys("Nick Amir");

        WebElement email = driver.findElement(By.name("email"));
        fullName.sendKeys("nick@gmail.com");

        WebElement submitButton = driver.findElement(By.name("wooden_spoon"));
        submitButton.click();
    }
}
