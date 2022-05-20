package com.cybertek.tests.d11_download_upload;

import com.cybertek.utilitties.WebDriverfactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FileUploadTest {
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
    public void test() throws InterruptedException {
        driver.get("http://practice.cybertekschool.com/upload");

        Thread.sleep(3000);
        driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\sabza\\OneDrive\\upload.txt");
        driver.findElement(By.id("file-submit")).click();

        String actual = driver.findElement(By.id("uploaded-files")).getText();
        Assert.assertEquals(actual, "file.txt");
    }
    @Test
    public void test2(){
        driver.get("http://practice.cybertekschool.com/upload");

        //location of current project
        String projectPath = System.getProperty("user.dir");
        //location of the file within the project
        String relativePath = "\\src\\test\\resources\\test_file.txt";

        //adding out projectPAth and relativePath to get absolutePath
        String fullPath = projectPath+relativePath;

        driver.findElement(By.id("file-upload")).sendKeys(fullPath);
        driver.findElement(By.id("file-submit")).click();
        String actual = driver.findElement(By.id("uploaded-files")).getText();
        Assert.assertEquals(actual, "test_file.txt");



    }
}
