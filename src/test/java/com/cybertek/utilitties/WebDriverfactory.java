package com.cybertek.utilitties;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverfactory {

    public static WebDriver getDriver(String browserType) {

        WebDriver driver = null;
            switch (browserType.toLowerCase()){
                case"chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;
                case"firefox":
                    WebDriverManager.chromedriver().setup();
                    driver = new FirefoxDriver();
            }
            return driver;
        }
    }

