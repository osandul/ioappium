package tests;

import Capabilities.AppiumDriverInit;
import Capabilities.PropertyFile;
import PageObjects.Page;
import PageObjects.SignInPage;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.*;

public class BookingSignIn extends Page{

    public AppiumDriver driver;

    SignInPage signInPage = new SignInPage ( );



    @BeforeMethod
    public void setDriverAndroid() {
        driver = AppiumDriverInit.getDriver ( );
    }

    @Test
    public void signInTest() {
        wait.until ( ExpectedConditions.visibilityOfElementLocated ( signInPage.getSignIn_start_button () ) ).click ( );
        wait.until ( ExpectedConditions.visibilityOfElementLocated ( signInPage.getSignIn_email_field () ) ).click ( );
        driver.findElement ( signInPage.getSignIn_email_input () ).sendKeys ( PropertyFile.getPropertyValue("new_email"));
        wait.until ( ExpectedConditions.visibilityOfElementLocated ( signInPage.getSignIn_password_field () ) ).click ( );
        driver.findElement ( signInPage.getSignIn_password_input () ).sendKeys ( PropertyFile.getPropertyValue("new_password"));
        driver.findElement ( signInPage.getSignIn_submit_button ()).click ( );
        wait.until ( ExpectedConditions.visibilityOfElementLocated ( signInPage.getSignIn_dialogue_checkmailbox () ) );
        String signIn_message = driver.findElement ( signInPage.getSignIn_dialogue_checkmailbox() ).getAttribute ( "text" );

        Assert.assertEquals ( signIn_message, signInPage.getSIGNIN_EMAIL_ACTIVATE_MESSAGE (),"Wrong email" );
        System.out.println ( "The registration was successfully completed" );

    }

    @Test
    public void emailExistsTest() {
        wait.until ( ExpectedConditions.visibilityOfElementLocated ( signInPage.getSignIn_start_button ( ) ) ).click ( );
        wait.until ( ExpectedConditions.visibilityOfElementLocated ( signInPage.getSignIn_email_field ( ) ) ).click ( );
        driver.findElement ( signInPage.getSignIn_email_input ( ) ).sendKeys ( PropertyFile.getPropertyValue ( "existing_email" ) );
        wait.until ( ExpectedConditions.visibilityOfElementLocated ( signInPage.getSignIn_password_field ( ) ) ).click ( );
        driver.findElement ( signInPage.getSignIn_password_input ( ) ).sendKeys ( PropertyFile.getPropertyValue ( "existing_password" ) );
        driver.findElement ( signInPage.getSignIn_submit_button ( ) ).click ( );
        wait.until ( ExpectedConditions.visibilityOfElementLocated ( signInPage.getSignIn_dialogue_checkmailbox ( ) ) );
        String signIn_message = driver.findElement ( signInPage.getSignIn_dialogue_checkmailbox ( ) ).getAttribute ( "text" );

        Assert.assertEquals (signIn_message, signInPage.getSIGNIN_EMAIL_EXISTS_MESSAGE ( ),"This email doesn't exist in the base" );
        System.out.println ( "This email already exists in the base" );

    }


    @AfterMethod

    public void quitDriver() {
        AppiumDriverInit.closeDriver ( );
    }


}

