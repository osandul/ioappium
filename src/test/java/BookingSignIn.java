import Capabilities.AppiumDriverInit;
import PageObjects.SignInPage;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BookingSignIn {
    AppiumDriver driver;

    SignInPage signInPage = new SignInPage ( );

    public String successful_signIn = "Check your inbox for an email. Use the provided link to activate your account.";
    public String email_exists_inDB = "Please enter a different email address, this one has been saved to an existing profile.";


    @BeforeTest
    public void setDriver() {
        driver = AppiumDriverInit.getDriver ( );
    }

    @Test

    public void signInTest() {
        WebDriverWait wait = new WebDriverWait ( driver, 10 );

        wait.until ( ExpectedConditions.visibilityOfElementLocated ( signInPage.signIn_start_button ) ).click ( );
        wait.until ( ExpectedConditions.visibilityOfElementLocated ( signInPage.signIn_email_field ) ).click ( );
        driver.findElement ( signInPage.signIn_email_input ).sendKeys ( "oleksandria.sanddul13@gmail.com" );
        wait.until ( ExpectedConditions.visibilityOfElementLocated ( signInPage.signIn_password_field ) ).click ( );
        driver.findElement ( signInPage.signIn_password_input ).sendKeys ( "1234abcd" );
        driver.findElement ( signInPage.signIn_submit_button ).click ( );
        wait.until ( ExpectedConditions.visibilityOfElementLocated ( signInPage.signIn_dialogue_checkmailbox ) );
        String signIn_message = driver.findElement ( signInPage.signIn_dialogue_checkmailbox ).getAttribute ( "text" );

        Assert.assertEquals ( signIn_message, successful_signIn );

        //       System.out.println ( "The registration was successfully completed" );

        //      signIn_output = false && signIn_message.equals ( email_exists_inDB );
        //      System.out.println ("Error. This email already exists in base");


    }

    @Test
    public void emailExistsTest(){
        WebDriverWait wait = new WebDriverWait ( driver, 10 );

        wait.until ( ExpectedConditions.visibilityOfElementLocated ( signInPage.signIn_start_button ) ).click ( );
        wait.until ( ExpectedConditions.visibilityOfElementLocated ( signInPage.signIn_email_field ) ).click ( );
        driver.findElement ( signInPage.signIn_email_input ).sendKeys ( "oleksandra.sandul13@gmail.com" );
        wait.until ( ExpectedConditions.visibilityOfElementLocated ( signInPage.signIn_password_field ) ).click ( );
        driver.findElement ( signInPage.signIn_password_input ).sendKeys ( "1234abcd" );
        driver.findElement ( signInPage.signIn_submit_button ).click ( );
        wait.until ( ExpectedConditions.visibilityOfElementLocated ( signInPage.signIn_dialogue_checkmailbox ) );
        String signIn_message = driver.findElement ( signInPage.signIn_dialogue_checkmailbox ).getAttribute ( "text" );

        Assert.assertEquals ( signIn_message, email_exists_inDB );
    }

    @AfterTest

    public void quitDriver() {
        AppiumDriverInit.closeDriver ();
    }
    

}

