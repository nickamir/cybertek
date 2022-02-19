package com.cybertek.tests.d2_webdriver_basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class GetUrlAndTitle {
    public static void main(String[] args) {
        //setting up the internet explorer
        WebDriverManager.edgedriver().setup();
        //running the driver
        WebDriver driver = new EdgeDriver();
        //going to website
        driver.get("https://coinmarketcap.com/");
        
        //getting title of the website
        String title = driver.getTitle();
        System.out.println("title = " + title);

        //getting url of the website
        String url = driver.getCurrentUrl();
        System.out.println("url = " + url);

        //getting the html og the webiste
        String pageSource = driver.getPageSource();
        System.out.println("pageSource = " + pageSource);

    }
}
