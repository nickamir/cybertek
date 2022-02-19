package com.cybertek.tests.d6_css_locator;

import com.cybertek.utilitties.WebDriverfactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CSSClassLocatorTest {
    public static void main(String[] args) {

        WebDriver driver = WebDriverfactory.getDriver("chrome");
        driver.manage().window().maximize();//this line of code is to make the screen full when we go there
        driver.get("http://practice.cybertekschool.com/multiple_butons");

        WebElement element = driver.findElement(By.cssSelector("a[class='nav-link']"));
        System.out.println(element.getText());
    }
}
