package com.cybertek.tests.d2_webdriver_basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class CloseAndQuit {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();

        driver.get("https://crypto.com/price");
        Thread.sleep(2000);
        driver.close();//this code closes a tab which we opend and it closes only one tab

        driver = new EdgeDriver();

        driver.get("https://www.nerdwallet.com/article/investing/cryptocurrency-7-things-to-know");
        Thread.sleep(2000);
        driver.quit();//closes this tab which we opened and all other tabs



    }
}
