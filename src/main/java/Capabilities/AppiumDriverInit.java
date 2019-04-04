package Capabilities;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;
import java.net.MalformedURLException;
import java.net.URL;

public class AppiumDriverInit extends PropertyFile {

    private static AppiumDriver driver;

    public enum Capability {
        AVD ( "avd" ),
        APP_PACKAGE("appPackage"),
        APP_ACTIVITY("appActivity"),
        ABD_TIMEOUT("adbExecTimeout"),
        AUTO_PERMISSIONS("autoGrantPermissions"),
        AUTOMATION_NAME("automationName");

        private final String NAME;

        Capability(String capability) {
            NAME = capability;
        }

        @Override
        public String toString() {
            return this.NAME;
        }
    }
        public static AppiumDriver getDriver() {
            if (driver == null) {
                try {
                    driver = setDriver ( );
                } catch (MalformedURLException e) {
                    e.printStackTrace ( );
                }
            }
            return driver;
        }

            private static AppiumDriver setDriver() throws MalformedURLException {
            DesiredCapabilities caps = new DesiredCapabilities ( );
            caps.setCapability ( MobileCapabilityType.DEVICE_NAME, PropertyFile.getAndroidProperty ( "deviceName" ) );
            caps.setCapability ( MobileCapabilityType.PLATFORM_NAME, PropertyFile.getPropertyValue ( "platformName" ) );
            caps.setCapability ( MobileCapabilityType.PLATFORM_VERSION, PropertyFile.getAndroidProperty ( "platformVersion" ) );
            caps.setCapability ( Capability.AVD.toString (), PropertyFile.getAndroidProperty ( "avd" ) );
            caps.setCapability ( Capability.APP_PACKAGE.toString (), PropertyFile.getAndroidProperty ( "appPackage" ) );
            caps.setCapability ( Capability.APP_ACTIVITY.toString (), PropertyFile.getAndroidProperty ( "appActivity" ) );
            caps.setCapability ( Capability.ABD_TIMEOUT.toString (), PropertyFile.getAndroidProperty ( "adbExecTimeout" ) );
            caps.setCapability ( Capability.AUTO_PERMISSIONS.toString (), PropertyFile.getAndroidProperty ( "autoGrantPermissions" ) );
            caps.setCapability ( Capability.AUTOMATION_NAME.toString (), PropertyFile.getAndroidProperty ( "automationName" ) );
            return driver = new AndroidDriver ( new URL ( PropertyFile.getPropertyValue ( "urlToConnect" ) ), caps );
        }

        public static void closeDriver() {
            if (driver != null) {
                getDriver ().quit ();
                driver = null;
            }
        }
    }

