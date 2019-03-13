

 import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
 import org.openqa.selenium.WebElement;
 import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.testng.annotations.BeforeMethod;
 import org.testng.annotations.BeforeTest;
 import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;


    public class  BookingApk {

        public static void main(String[] args) {
            basicTest ();
        }


        public static AppiumDriver driver;
        public static WebDriverWait wait;


        static WebElement signIn = driver.findElement ( By.id ( "com.booking:id/login_button_sign_up" ) );
        static WebElement email = driver.findElement ( By.id ( "com.booking:id/login_page_sign_up_email_input_layout" ) );
        static WebElement password = driver.findElement ( By.id ( "com.booking:id/login_page_sign_up_password_input_layout" ) );
        static WebElement button = driver.findElement ( By.id ( "com.booking:id/login_page_sign_in_guided_action_button" ) );


@BeforeTest
        public static void setup() throws MalformedURLException {
            DesiredCapabilities caps = new DesiredCapabilities ();
            caps.setCapability ( "deviceName", "Nexus_5X_API_28" );
            caps.setCapability ( "avd", "Nexus_5X_API_28" );
            caps.setCapability ( "platformName", "Android" );
            caps.setCapability ( "platformVersion", "9.0" );
            caps.setCapability ( "appPackage", "com.booking" );
            caps.setCapability ( "appActivity", "com.booking.login.LoginActivity" );
            caps.setCapability ( "adbExecTimeout", "200000" );

            driver = new AndroidDriver ( new URL ( "http://127.0.0.1:4723/wd/hub" ), caps );
            wait = new WebDriverWait ( driver, 10 );
        }


@Test

            public static void basicTest () {

                wait.until ( ExpectedConditions.visibilityOf ( signIn ) ).click ();

                //Click and pass Tutorial
                wait.until ( ExpectedConditions.visibilityOf ( email ) ).click ();

                email.sendKeys ( "oleksandra.sandul13@gmail.com" );

                wait.until ( ExpectedConditions.visibilityOf ( password ) ).click ();
                password.sendKeys ( "1234abcd" );

                button.click ();


            }


        }

