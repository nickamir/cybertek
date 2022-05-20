package com.cybertek.tests;

import com.cybertek.utilitties.WebDriverfactory;
import org.openqa.selenium.WebDriver;

public class CallTheFactory {
    public static void main(String[] args) {
        WebDriver driver;
         driver = WebDriverfactory.getDriver("chrome");
    }
}
