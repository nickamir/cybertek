package com.cybertek.pages;

import com.cybertek.utilitties.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){
       //below line iitializes this class in other classes
        //without it the whole class is useless
        PageFactory.initElements(Driver.get(), this);
    }
    @FindBy(id="prependedInput")
    public WebElement userName;

    @FindBys({
    @FindBy(name="prependedInput2"),
    @FindBy(id="prependedInput2")})// if for example the id or the name  of the object keeps on changing we can use @FindBys to find object by either way.
    public WebElement password;

    //driver.findElement(By.name("_submit")
    @FindBy(name="_submit")
    public WebElement submit;

    public void login(String usernameStr, String passwordStr){
        userName.sendKeys(usernameStr);
        password.sendKeys(passwordStr);
        submit.click();
    }

    }
