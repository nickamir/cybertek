package com.cybertek.tests.d17_extent_reports;

import com.cybertek.pages.LoginPage;
import com.cybertek.tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NegativeLoginTestWithReports extends TestBase {
    @Test
    public void wrongPasswordTest() {
        //if we dont add extentLogger = report.createTest() , this test will not be in the html report
        extentLogger = report.createTest("Wrong password test");
        LoginPage loginpage = new LoginPage();
        extentLogger.info("Enter Username");
        loginpage.userName.sendKeys("outtahere");
        extentLogger.info("Enter password");
        loginpage.password.sendKeys("uknowwheretogo");
        extentLogger.info("click submit");
        loginpage.submit.click();
        extentLogger.info("verify page url");
        Assert.assertEquals(driver.getCurrentUrl(), "https://qa3.vytrack.com/user/login");
        extentLogger.pass("PASS: wrong password test");

    }

    @Test
    public void wrongUsernameTest() {
        //if we dont add extentLogger = report.createTest() , this test will not be in the html report
        extentLogger = report.createTest("Wrong username test");
        LoginPage loginpage = new LoginPage();
        extentLogger.info("Enter Username");
        loginpage.userName.sendKeys("outtahere");
        extentLogger.info("Enter password");
        loginpage.password.sendKeys("uknowwheretogo");
        extentLogger.info("click submit");
        loginpage.submit.click();
        extentLogger.info("verify page url");
        Assert.assertEquals(driver.getCurrentUrl(), "https://google.com/");
        extentLogger.pass("PASS: wrong password test");
    }
}
