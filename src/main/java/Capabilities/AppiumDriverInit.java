package Capabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;
import java.net.MalformedURLException;
import java.net.URL;

public class AppiumDriverInit {

    private static AppiumDriver driver = null;

    private AppiumDriverInit() {

    }

    public static AppiumDriver getDriver() {
        if (driver == null) {
            try {
                setDriver ( );
            } catch (MalformedURLException e) {
                e.printStackTrace ( );
            }
        }
        return driver;
    }

    public static AppiumDriver setDriver() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities ( );
        caps.setCapability ( MobileCapabilityType.DEVICE_NAME,ReadPropertyFile.getAndroidProperty ( "deviceName" ));
        caps.setCapability ( "avd", ReadPropertyFile.getAndroidProperty ( "avd" ));
        caps.setCapability ( MobileCapabilityType.PLATFORM_NAME, ReadPropertyFile.getPropertyValue("platformName"));
        caps.setCapability ( MobileCapabilityType.PLATFORM_VERSION, ReadPropertyFile.getAndroidProperty ("platformVersion"));
        caps.setCapability ( "appPackage",  ReadPropertyFile.getAndroidProperty ("appPackage"));
        caps.setCapability ( "appActivity", ReadPropertyFile.getAndroidProperty ("appActivity" ));
        caps.setCapability ( "adbExecTimeout", ReadPropertyFile.getAndroidProperty ( "adbExecTimeout") );
        caps.setCapability ( "autoGrantPermissions", ReadPropertyFile.getAndroidProperty ( "autoGrantPermissions"));
        caps.setCapability ( "automationName", ReadPropertyFile.getAndroidProperty ( "automationName" ));
        return driver = new AndroidDriver ( new URL ( ReadPropertyFile.getPropertyValue ( "urlToConnect" )) , caps );
    }


    public static void closeDriver() {
        if (driver != null) {
            getDriver ( ).quit ( );
            driver=null;
        }
    }

}

