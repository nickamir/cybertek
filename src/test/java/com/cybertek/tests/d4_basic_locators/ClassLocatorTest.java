package com.cybertek.tests.d4_basic_locators;

import com.cybertek.utilitties.WebDriverfactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ClassLocatorTest {
    public static void main(String[] args) {
        WebDriver driver = WebDriverfactory.getDriver("chrome");
        driver.manage().window().maximize();//this line of code is to make the screen full when we go there

        driver.get("http://practice.cybertekschool.com/sign_up");

        WebElement home = driver.findElement(By.className("nav-link"));
        home.click();

        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        WebElement title = driver.findElement(By.className("h3"));

        System.out.println(title.getText());

    }
}
