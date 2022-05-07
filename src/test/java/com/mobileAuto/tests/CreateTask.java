package com.mobileAuto.tests;

import com.mobileAuto.pages.StartPage;
import org.testng.annotations.Test;

public class CreateTask extends TestBase{

    //static StartPage startPage = PageFactory.initElements(driver, StartPage.class);

    StartPage startPage;
    @Test
    public void test_01(){
        startPage = new StartPage(driver);

       // StartPage startPage = PageFactory.initElements(driver, StartPage.class);
        startPage.clickOnAddButton();

    }

    @Test
    public void test_02(){
        startPage = new StartPage(driver);
       // StartPage startPage = PageFactory.initElements(driver, StartPage.class);
    startPage.quickAddTask("Hello world");

    }
}
