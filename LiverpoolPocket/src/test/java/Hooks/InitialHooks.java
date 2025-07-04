package Hooks;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

import java.net.URL;

public class InitialHooks {
    public static AppiumDriver driverApp;

    public void createDriver() {
        UiAutomator2Options optionsAdmin = new UiAutomator2Options();
        optionsAdmin.setDeviceName("Pixel3").setPlatformVersion("16.0").setApp("C:\\Users\\a_gal\\Downloads\\Liverpool.apk").setPlatformName("Android").setAutomationName("UiAutomator2").autoGrantPermissions();
        try {
            driverApp = new AndroidDriver(new URL("http://0.0.0.0:4723"), optionsAdmin);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


}