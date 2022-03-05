package com.cybertek.tests.d15_page_object_model_based_tests;

import com.cybertek.pages.LoginPage;
import com.cybertek.tests.TestBase;
import com.cybertek.utilitties.ConfigurationReader;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.TestInstance;

public class NegativeLoginTests extends TestBase {

    @Test
    public void wrongPasswordTest() {

        LoginPage loginpage = new LoginPage();
        loginpage.userName.sendKeys("outtahere");
        loginpage.password.sendKeys("uknowwheretogo");
        loginpage.submit.click();

        Assert.assertEquals(driver.getCurrentUrl(), "https://qa3.vytrack.com/user/login");

    }

    @Test
    public void wrongUsernameTest() {

        LoginPage loginpage = new LoginPage();
        loginpage.userName.sendKeys("outta");
        loginpage.password.sendKeys("uknowwhero");
        loginpage.submit.click();

        Assert.assertEquals(driver.getCurrentUrl(), "https://qa3.vytrack.com/user/login");

    }
}
