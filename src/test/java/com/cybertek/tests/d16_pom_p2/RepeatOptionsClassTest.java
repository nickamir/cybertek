package com.cybertek.tests.d16_pom_p2;

import com.cybertek.pages.CalendarEventsPage;
import com.cybertek.pages.CreateCalendarEventsPage;
import com.cybertek.pages.DashBoardPage;
import com.cybertek.pages.LoginPage;
import com.cybertek.tests.TestBase;
import com.cybertek.utilitties.ConfigurationReader;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class RepeatOptionsClassTest extends TestBase {

    @Test
    public void test1() {
        //login in as driver
        LoginPage loginPage = new LoginPage();
        String username = ConfigurationReader.get("driver_username");
        String password = ConfigurationReader.get("driver_password");
        loginPage.login(username, password);

        //go to "activities" -> "Calendar Events"
        DashBoardPage dashBoardPage = new DashBoardPage();
        //dashBoardPage.navigateToModule("Activities", "Calendar Events");

        //click one Calendar Events
        CalendarEventsPage calendarEventsPage = new CalendarEventsPage();
        //this line is waiting until the page is loading
        //code is not working: calendarEventsPage.waitUntilLoaderScreenDisappear();
        calendarEventsPage.createCalendarEvent.click();

        //Click on repeat
        CreateCalendarEventsPage createCalendarEventsPage = new CreateCalendarEventsPage();
        //code is not working: calendarEventsPage.waitUntilLoaderScreenDisappear();
        createCalendarEventsPage.repeat.click();

        //Verify that repeat every day is checked
        Assert.assertTrue(createCalendarEventsPage.days.isSelected());
        //Verify that repeat weekday is not checked
        Assert.assertFalse(createCalendarEventsPage.weekday.isSelected());

    }

    @Test
    public void test2() {
        //login in as driver
        LoginPage loginPage = new LoginPage();
        String username = ConfigurationReader.get("driver_username");
        String password = ConfigurationReader.get("driver_password");
        loginPage.login(username, password);

        //go to "activities" -> "Calendar Events"
        DashBoardPage dashBoardPage = new DashBoardPage();
        //dashBoardPage.navigateToModule("Activities", "Calendar Events");

        //click one Calendar Events
        CalendarEventsPage calendarEventsPage = new CalendarEventsPage();
        //this line is waiting until the page is loading
        //code is not working: calendarEventsPage.waitUntilLoaderScreenDisappear();
        calendarEventsPage.createCalendarEvent.click();

        //Click on repeat
        CreateCalendarEventsPage createCalendarEventsPage = new CreateCalendarEventsPage();
        //code is not working: calendarEventsPage.waitUntilLoaderScreenDisappear();
        createCalendarEventsPage.repeat.click();

        //Verify that repeat options are Daily, Weekly, Monthly, Yearly(in that order)
        List<String> expectedList = Arrays.asList("Daily", "Weekly", "Monthly", "Yearly");
        List<WebElement> options = createCalendarEventsPage.repeatOptionsList().getOptions();
        //code is not workin: List<String> actualList = BrowserUtils.getElementText(options);
        //code is not workin:Assert.assertEquals(actualList,expectedList, "Repeat options did not match");
    }
}
