package com.cybertek.tests.d14_properties_driver_class_test_base_class;

import com.cybertek.utilitties.ConfigurationReader;
import com.cybertek.utilitties.Driver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class SingletonTest {

    @Test
    public void test1() throws InterruptedException {
        //this is how we get driver firw now on
        WebDriver driver = Driver.get();
        Thread.sleep(3000);

        String url = ConfigurationReader.get("url");
        driver.get(url);
        Driver.closeDriver();
    }
}
