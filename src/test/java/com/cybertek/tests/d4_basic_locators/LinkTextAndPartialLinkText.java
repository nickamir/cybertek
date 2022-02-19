package com.cybertek.tests.d4_basic_locators;

import com.cybertek.utilitties.WebDriverfactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LinkTextAndPartialLinkText {
    public static void main(String[] args) {
        WebDriver driver = WebDriverfactory.getDriver("chrome");
        driver.manage().window().maximize();//this line of code is to make the screen full when we go there

        driver.get("http://practice.cybertekschool.com/sign_up");

        //Link
        WebElement link6 = driver.findElement(By.linkText("Example 6 :Loading overlay that disappears and dissappears again"));
        System.out.println(link6.getText());

        WebElement cbt = driver.findElement(By.linkText("Cybertek School"));
        System.out.println(cbt.getText());

        //Partial Link
        WebElement link6Again = driver.findElement(By.partialLinkText("Example 6"));

    }
}
