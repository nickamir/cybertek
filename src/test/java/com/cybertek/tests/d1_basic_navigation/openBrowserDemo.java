package com.cybertek.tests.d1_basic_navigation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class openBrowserDemo {
    public static void main(String[] args) {

        //we have to enter this line everytime we want to go to browser
        WebDriverManager.firefoxdriver().setup();

        //this part is selenium
        //WebDriver- represents browser
        //FirefoxDriver() --> opens driver
        WebDriver driver = new FirefoxDriver();





    }
}
