package com.mobileAuto.pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class StartPage extends BasePage{



    // locators

    @FindBy(id = "fabAddTask")
    public WebElement addButton;

    @FindBy(id = "etQuickTask")
    public WebElement quickTask;

    @FindBy(id = "ivAddQuickTask")
    public WebElement addQuickTestAction;

    public StartPage(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }

    public void clickOnAddButton(){
        clickAnElement(addButton);
    }

    public void quickAddTask(String text){
        enterText(quickTask,text);
       clickAnElement(addQuickTestAction);
    }
}
