package com.cybertek.tests.d9_tabs_frames_alerts_popups;

import com.cybertek.utilitties.WebDriverfactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Frames {
    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        driver = WebDriverfactory.getDriver("chrome");
    }

    @AfterMethod
    public void teardownMethod() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();

    }

    @Test
    public void test() {
        driver.get("http://practice.cybertekschool.com/frames");
        //ID or Name
        //switchTo().frame() --> switched to frame
        driver.switchTo().frame("mce_0_ifr");
        driver.findElement(By.id("tinymce")).sendKeys("Hello");
        //go bakc to main HTML
        driver.switchTo().defaultContent();

        //2.Index
        driver.switchTo().frame(0);
        driver.findElement(By.id("tinymce")).sendKeys("sup");
        //go back to parent frame
        driver.switchTo().parentFrame();

        ///3Webelement
        WebElement frame = driver.findElement(By.tagName("iframe"));
        driver.switchTo().frame(frame);
        driver.findElement(By.id("tinymce")).clear();//deleting the text


    }
    //Many Frames
    @Test
    public void manyFrames(){
        driver.get("http://practice.cybertekschool.com/frames");
        //top-frame
        driver.switchTo().frame("frame-top");
       //going to middle frme
        driver.switchTo().frame("frame-middle");

        //before going to right and left frames we have to to paresnt frame first
        driver.switchTo().parentFrame();
        //going to right frame
        driver.switchTo().frame("frame-right");

        //going to HTML ORIGINAL page
        driver.switchTo().defaultContent();

    }
}
