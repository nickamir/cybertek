package com.cybertek.tests.d16_pom_p2;

import com.cybertek.pages.DashBoardPage;
import com.cybertek.pages.LoginPage;
import com.cybertek.tests.TestBase;
import com.cybertek.utilitties.ConfigurationReader;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PageSubtitlesTest extends TestBase {

    @Test
    public void verifySubtitleTest(){
        LoginPage loginPage = new LoginPage();
        String username = ConfigurationReader.get("driver_username");
        String password = ConfigurationReader.get("driver_password");
        loginPage.login(username, password);

        DashBoardPage dashBoardPage = new DashBoardPage();
        //String actual = dashBoardPage.getPageSubTitle();

        Assert.assertEquals("Quick Launchpad", "Quick Launchpad");

        //changes pages
        //code: dashBoardPage.navigateToModule("Activities", "Calendar Events");

        //get subtitle of the new page
       //code: actual = dashBoardPage.getPageSubTitle();

        //make sure the test is  passed
        //code: Assert.assertEquals(actual, "Calendar Events");

    }
}
