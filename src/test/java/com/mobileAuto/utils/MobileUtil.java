package com.mobileAuto.utils;

public class MobileUtil {

    public static void waitFor(int second){

        try {
            Thread.sleep(second * 1000);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
