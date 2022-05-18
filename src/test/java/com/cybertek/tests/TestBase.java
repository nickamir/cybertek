package com.cybertek.tests;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.cybertek.utilitties.ConfigurationReader;
import com.cybertek.utilitties.Driver;
import com.cybertek.utilitties.WebDriverfactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.ITestResult;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class TestBase {
    protected WebDriver driver;

    protected String url;

    Actions actions;

    //protected --> means not available for all classes
    protected ExtentReports report;
    protected ExtentHtmlReporter htmlReporter;
    protected ExtentTest extentLogger;

    @BeforeTest
    public void setUpTest() {
        report = new ExtentReports();
        String path = System.getProperty("user.dir") + "/test-output/report.html";
        htmlReporter = new ExtentHtmlReporter(path);
        report.attachReporter(htmlReporter);

        htmlReporter.config().setReportName("Vytrack smoke tests");
        report.setSystemInfo("Environment", "QA");
        report.setSystemInfo("Browser", ConfigurationReader.get("QA"));
        report.setSystemInfo("OS", System.getProperty("QA"));


    }

    @AfterTest
    public void tearDownTest() {
        report.flush();
    }

    @BeforeMethod
    @Parameters("env") //it means we agree for our codes to take orders from XML Runner
    public void setupMethod(@Optional String env) {
        System.out.println("env = " + env);
        //ENV is null use default url, if ENV is not null get url based on ENV
        if (env== null){
            url = ConfigurationReader.get("url");
        }else{
            url = ConfigurationReader.get("url"+env);
        }

        driver = Driver.get();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        url = ConfigurationReader.get("url");
        driver.get(url);
        actions = new Actions(driver);
    }

    @AfterMethod
    public void teardownMethod(ITestResult result) throws InterruptedException {
        //ITestResult--> we added this line so when e have error in our code it will let us know

        //if test is failed take screenshot
        if (result.getStatus() == ITestResult.FAILURE) {
        //record the name of the failed test
        extentLogger.fail(result.getName());
        //take screenshot and return location of the screenshot
              //String screenshot = BrowserUtils.getScreenShot(result.getName());
              //extentLogger.addScreenCaptureFromPath(screenshot);
        }else if (result.getStatus() ==ITestResult.SKIP){
            //sometimes test are skipped, this is how we log skipped tests
            extentLogger.skip("Test Skipped:" + result.getName());
        }

        Thread.sleep(3000);
        Driver.closeDriver();

    }
}