package com.cybertek.pages;

import com.cybertek.utilitties.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreateCalendarEventsPage extends BasePage{

    public CreateCalendarEventsPage() { PageFactory.initElements(Driver.get(), this );}

    @FindBy(css ="[id^='recurrence-repeat-view']")
    public WebElement repeat;

    @FindBy(css ="[id^='recurrence-repeat-view']")
    public WebElement repeatOptions;
    @FindBy(className ="select2-chosen")
    public WebElement selectedOwner;

    @FindBy(css ="input[id^='oro_calendar_event_form_title-']")
    public WebElement title;

    @FindBy(css ="input[id^='date_selector_oro_calendar_event_form_start']")
    public WebElement startDate;
    @FindBy(css ="input[id^='date_selector_oro_calendar_event_form_end']")
    public WebElement endDate;

    @FindBy(css ="input[id^='time_selector_oro_calendar_event_form_start']")
    public WebElement startTime;

    @FindBy(css ="input[id^='time_selector_oro_calendar_event_form_end']")
    public WebElement endTime;

    @FindBy(xpath = "//input[@type='radio'])[1]")
    public WebElement days;

    @FindBy(xpath = "//input[@type='radio'])[2]")
    public WebElement weekday;

    @FindBy(xpath = "//input[@type='radio'])[3]")
    public WebElement never;

    @FindBy(xpath = "//input[@type='radio'])[4]")
    public WebElement after;

    @FindBy(xpath = "//input[@type='radio'])[5]")
    public WebElement by;

    public Select repeatOptionsList() {return new Select(repeatOptions)}





}
