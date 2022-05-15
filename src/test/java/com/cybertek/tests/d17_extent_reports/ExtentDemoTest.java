package com.cybertek.tests.d17_extent_reports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ExtentDemoTest {
    ExtentReports report;   //this class is used for starting and building the reports
    ExtentHtmlReporter htmlReporter;  //this class is used to create the HTML report
    ExtentTest extentLogger;   //this will define a test,enables adding logs, authors, test info, etc...


    @BeforeMethod
    public void setUp(){

        //initialize the classes
        report = new ExtentReports();

        //create report path
        //System.getProperty("user.dir") --> returns the location/path of my project
        ///test-output/report.html --> report will be in the test output folder, name --> report.html
        String path= System.getProperty("user.dir") + "/test-output/report.html";

        //initialize the HTML reporter with the report path
        htmlReporter = new ExtentHtmlReporter(path);

        //attach HTML reporter to the report object
        report.attachReporter(htmlReporter);


        //set the title of the report
        htmlReporter.config().setReportName("Vytrack smoke tests");

        //set environment information
        report.setSystemInfo("Environment", "QA");
        report.setSystemInfo("browsr", "chrome");
        report.setSystemInfo("My name", "Nick");



    }

    @Test
    public void test1(){
      //give name to the current test
        extentLogger = report.createTest("Login as driver test");
        //Test  steps
        extentLogger.info("Open Chrome");
        extentLogger.info("go to url");
        extentLogger.info("enter driver login info");
        extentLogger.info("click submit");
        extentLogger.info("click verify logged in");
        //pass() --> marks test as passed
        extentLogger.pass("TC001 passed");

    }


    @AfterMethod
    public void close(){

        //this is when the report is created
        report.flush();
    }
}
