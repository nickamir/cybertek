package com.cybertek.tests.d9_tabs_frames_alerts_popups;

import com.cybertek.utilitties.WebDriverfactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PopUpsAndAlerts {
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
        public void htmlPopup() {
            driver.get("thhps://www.primefaces.org/showcase/ui/overlay/confirmDialog.xhtml");
            //bring pop up
            driver.findElement(By.xpath("//span[.='Destroy the World']"));
            //click no on the pop up
            driver.findElement(By.xpath("//span[.='No']")).click();
        }

        @Test
    public void jsAlerts(){
        driver.get("http://practice.cybertekschool.com/javascript_alerts");
        //trigger the alert
            driver.findElement(By.xpath("//button[1]")).click();
            //control the alert using alert class
            Alert alert = driver.switchTo().alert();
            //accept alert --> clicking ok in alerts
            alert.accept();

            // trigger the second alert
            driver.findElement(By.xpath("//button[2]")).click();
            //switch to the new alert
            alert = driver.switchTo().alert();
            //dismiss -->clicking x to close, selecting no/cancel
            alert.dismiss();

            // trigger the 3rd alert
            driver.findElement(By.xpath("//button[2]")).click();
            //switch to the new alert
            alert = driver.switchTo().alert();
            //send Keys to alert
            alert.sendKeys("sup baby");
            //print text of the alert
            System.out.println(alert.getText());
            //alert accepting so we could see the result
            alert.accept();


        }



}
