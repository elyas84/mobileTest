package com.mobileAuto.tests;

import com.mobileAuto.pages.StartPage;
import org.testng.annotations.Test;

public class CreateTask extends TestBase{

    StartPage startPage;
    @Test
    public void test_01(){
        startPage = new StartPage(driver);
        startPage.clickOnAddButton();

    }

    @Test
    public void test_02(){
        startPage = new StartPage(driver);
    startPage.quickAddTask("Hello world");

    }
}
