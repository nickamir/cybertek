package com.cybertek.tests.o3_pom;

import com.cybertek.pages.ContactInfoPage;
import com.cybertek.pages.ContactsPage;
import com.cybertek.pages.LoginPage;
import com.cybertek.tests.TestBase;
import com.cybertek.utilitties.ConfigurationReader;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyContactInformationPage extends TestBase {
    @Test
    public void contactDetailsTest(){
        //add this test to Extent Report
        extentLogger= report.createTest("Contact details test");

        //login
        extentLogger.info("Login");
        LoginPage loginPage = new LoginPage();
        String username = ConfigurationReader.get("sales_manager_username");
        String password = ConfigurationReader.get("sales_manager_password");
        extentLogger.info("username" + username);
        extentLogger.info("password" + password);
        loginPage.login(username,password);

        //go to "Customers" --> "Contacts"
        extentLogger.info("go to 'Customers'--> 'Contacts'");
        ContactsPage contactsPage = new ContactsPage();
        //contactsPage.navigateToModule("Customers", "Contacts");

        //click on email
        extentLogger.info("click on needed email");
        //wait before clicking
        //contactsPage.waitUntilLoaderScreenDisappear();
        contactsPage.getContactEmail("mbrackstone9@example.com");

        //verify name
        ContactInfoPage contactInfoPage = new ContactInfoPage();
        extentLogger.info("verify the full name is MS Mariam Brackstone");
        String actualName = contactInfoPage.contactFullName.getText();
        Assert.assertEquals("MS Mariam Brackstone", actualName );

        //verify phone
        extentLogger.info("verify the phone number is 18982323434");
        String actualPhone = contactInfoPage.phone.getText();
        Assert.assertEquals("18982323434", actualPhone);

        //verify email
        //verify phone
        extentLogger.info("verify the email ");
        String actualEmail = contactInfoPage.email.getText();
        Assert.assertEquals("mbrackstone9@example.com", actualEmail);


    }
}
