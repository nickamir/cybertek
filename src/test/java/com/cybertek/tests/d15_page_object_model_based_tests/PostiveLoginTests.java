package com.cybertek.tests.d15_page_object_model_based_tests;

import com.cybertek.pages.LoginPage;
import com.cybertek.tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PostiveLoginTests extends TestBase {

    @Test
    public void LogIn(){
        LoginPage loginpage = new LoginPage();
        loginpage.userName.sendKeys("user2");
        loginpage.password.sendKeys("UserUser123");
        loginpage.submit.click();

        Assert.assertEquals(driver.getCurrentUrl(), "https://qa3.vytrack.com/");

    }
    @Test
    public void LogIn2(){
        LoginPage loginpage = new LoginPage();
        loginpage.login("storemanager101", "UserUser123");
        Assert.assertEquals(driver.getCurrentUrl(), "https://qa3.vytrack.com/");
    }



}
