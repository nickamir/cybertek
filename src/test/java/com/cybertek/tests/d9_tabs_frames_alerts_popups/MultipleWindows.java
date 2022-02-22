package com.cybertek.tests.d9_tabs_frames_alerts_popups;

import com.cybertek.utilitties.WebDriverfactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MultipleWindows {
    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
        driver = WebDriverfactory.getDriver("chrome");
    }

    @AfterMethod
    public void teardownMethod() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();

    }
    @Test
    public void test(){
          driver.get("http://practice.cybertekschool.com/windows");
          String targetTitle = "New Window";
          driver.findElement(By.linkText("Click Here")).click();
          //how many windows are open right now
        System.out.println(driver.getWindowHandles().size());

        //itirate through all windows
        for (String handle: driver.getWindowHandles()){
            //switch to them one by one
            driver.switchTo().window(handle);
            //get title and compare target title
            if (driver.getTitle().equals(targetTitle)){
                //stop looping
                break;
            }
        }
        System.out.println(driver.getTitle());

    }
}
