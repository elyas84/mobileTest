package com.mobileAuto.pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;


public abstract class BasePage {

    public BasePage(AppiumDriver appiumDriver){

        PageFactory.initElements(appiumDriver, this);
    }

    public void clickAnElement(WebElement element){
        element.click();
    }

    public void enterText(WebElement element, String text){
        element.sendKeys(text);
    }
}
