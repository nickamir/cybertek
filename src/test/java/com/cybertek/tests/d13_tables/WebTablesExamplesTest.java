package com.cybertek.tests.d13_tables;

import com.cybertek.tests.TestBase;
import com.cybertek.utilitties.WebDriverfactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class WebTablesExamplesTest extends TestBase {



    @Test
    public void printTable(){
        driver.get("http://practice.cybertekschool.com/tables");
        WebElement mytable  = driver.findElement(By.id("table1"));
        System.out.println(mytable.getText());

        //verify some email is here
        Assert.assertTrue(mytable.getText().contains("jsmith@gmail.com"));
    }
    @Test
    public void getAllHeaders(){
        //get all header invdividualy
        List<WebElement> headers = driver.findElements(By.xpath("//tab;e[@id='table1']//th"));
        System.out.println("header.size()=" + headers.size());

        for (WebElement header : headers) {
            System.out.println(header.getText());
        }


        }
    @Test
    public void printTableSize(){
        //get the number of headers
        List<WebElement> headers = driver.findElements(By.xpath("//table[@id='table1']//th"));
        System.out.println("header.size()=" + headers.size());

        //get the number of rows Including Header
        List<WebElement> rowsIncludingHeader = driver.findElements(By.xpath("//table[@id='table1']//tr"));
        System.out.println("rowsIncludingHeader.size()=" + rowsIncludingHeader.size());

        //get the number of rows Excluding Header
        List<WebElement> rowsExcludingHeader = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr"));
        System.out.println("rowsExcludingHeader.size()=" + rowsExcludingHeader.size());

    }
    @Test
    public void getRow(){
        //there two ways to get the number of rows
        //First-> by index
        WebElement row = driver.findElement(By.xpath("//table[@id='table1']/tbody/tr[1]"));
        System.out.println(row.getText());

        //Second-> by for loop
        List<WebElement> rowsExcludingHeader = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr"));
        System.out.println("rowsExcludingHeader.size()=" + rowsExcludingHeader.size());

        for (int i = 1; i < rowsExcludingHeader.size(); i++) {
            String xpath = "//table[@id='table1']/tbody/tr["+i+"]";
            System.out.println(xpath);
            WebElement singleRow = driver.findElement(By.xpath(xpath));
            System.out.println(singleRow.getText());

        }


        }
    @Test
    public void test4(){

        //get email of Jason
        String name = "Jason";
        String xpath= "//table[@id='table1']//td[.='" + name + "']/../td[3]";
        System.out.println(driver.findElement(By.xpath(xpath)).getText());
    }
}

