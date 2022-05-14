package com.mobileAuto.tests;

import com.mobileAuto.utils.ConfigurationReader;
import com.mobileAuto.utils.MobileUtil;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.*;

import java.net.URL;

public class TestBase {

    static AppiumDriver driver;
    public  DesiredCapabilities ds;

    @BeforeMethod
    public void setUp(){

        try {
            ds = new DesiredCapabilities();
            ds.setCapability(MobileCapabilityType.PLATFORM_NAME, "Test me");
            ds.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);
            ds.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9.0");

            ds.setCapability("appActivity", ConfigurationReader.get("appActivity"));
            ds.setCapability("appPackage", ConfigurationReader.get("appPackage"));

            URL url = new URL(ConfigurationReader.get("connectionUrl"));
            driver = new AppiumDriver(url, ds);

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @AfterMethod
    public void tearDown(){
        try {
                MobileUtil.waitFor(3);
                driver.quit();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
