package com.cybertek.tests.d5_XPath;

import com.cybertek.utilitties.WebDriverfactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class
XPathTestDemoClass {
    public static void main(String[] args) {
        WebDriver driver = WebDriverfactory.getDriver("chrome");
        driver.manage().window().maximize();//this line of code is to make the screen full when we go there
        driver.get("http://practice.cybertekschool.com/multiple_butons");

        WebElement link = driver.findElement(By.xpath("/html/body/div/div/div/div/h3"));//Absolute Xpath
        System.out.println(link.getText());

        driver.get("http://practice.cybertekschool.com/multiple_butons");
        WebElement relativelink = driver.findElement(By.xpath("//h3"));//Relative Xpath
        System.out.println(relativelink.getText());

        driver.get("http://practice.cybertekschool.com/multiple_butons");
        WebElement link3 = driver.findElement(By.xpath("//button[@onclick='button1()']"));//Third way of XPath
        System.out.println(link3.getText());

        driver.get("http://practice.cybertekschool.com/multiple_butons");
        WebElement link4 = driver.findElement(By.xpath("//*[contains(text(), 'tek Sch')]"));//Third way of XPath
        System.out.println(link4.getText());

    }
}
