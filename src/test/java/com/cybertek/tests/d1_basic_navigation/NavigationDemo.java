package com.cybertek.tests.d1_basic_navigation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class NavigationDemo {
    public static void main(String[] args) throws InterruptedException {


        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();

        //moving to websites
        driver.get("https://mvnrepository.com/");
        System.out.println(driver.getTitle());

        Thread.sleep(1000);
        driver.navigate().to("https://amazon.com/");
        System.out.println(driver.getTitle());

        Thread.sleep(1000);
        driver.navigate().back();//goes back to the first website
        System.out.println(driver.getTitle());

        Thread.sleep(1000);
        driver.navigate().forward();//goes back and then to the previous website
        System.out.println(driver.getTitle());


    }
}
