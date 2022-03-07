package com.cybertek.pages;

import com.cybertek.utilitties.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    @FindBy(css = "div[class='loader-mask shown']")
    @CacheLookup
    protected WebElement loaderMask;

    @FindBy(css = "h1[class='oro-subtitle']")
    protected WebElement pageSubtitle;

    @FindBy(css = "#user-menu > a")
    protected WebElement userName;

    @FindBy(linkText= "Logout")
    public WebElement logOutLink;

    @FindBy(linkText = "My User")
    protected WebElement myUser;

    public BasePage() {
        PageFactory.initElements(Driver.get(), this );
    }

}
