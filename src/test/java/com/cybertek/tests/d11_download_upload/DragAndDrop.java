package com.cybertek.tests.d11_download_upload;

import com.cybertek.utilitties.WebDriverfactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DragAndDrop {
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
    public void dragdrop1Way() throws InterruptedException {
        driver.get("https://demos.telerik.com/kendo-ui/dragdrop/index");

        //source--> we will drag this element from
        WebElement source = driver.findElement(By.id("draggable"));
        //targer--> we drop it here
        WebElement target = driver.findElement(By.id("droptarget"));

        Actions actions = new Actions(driver);

        Thread.sleep(3000);
        actions.dragAndDrop(source, target).perform();//we put perform after every action

    }

    @Test
    public void dragdrop2Way() throws InterruptedException {
        driver.get("https://demos.telerik.com/kendo-ui/dragdrop/index");

        //source--> we will drag this element from
        WebElement source = driver.findElement(By.id("draggable"));
        //targer--> we drop it here
        WebElement target = driver.findElement(By.id("droptarget"));

        Actions actions = new Actions(driver);
        //we can chain multiple actions
        //at the end we call the build().perform()
        //build --> is used to chain the actions
        actions.moveToElement(source).clickAndHold().moveToElement(target).release().build().perform();
    }
}
